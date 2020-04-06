package CTXEngine.Graphics.GL;

import static CTXEngine.Core.SimplePrint.*;
import static org.lwjgl.opengl.GL30.*;

import java.util.ArrayList;
import CTXEngine.Graphics.BufferImpl;
import CTXEngine.Graphics.BufferObject.IndexBufferObject;
import CTXEngine.Graphics.BufferObject.VertexAttribute;
import CTXEngine.Graphics.BufferObject.VertexBufferObject;
import CTXEngine.Graphics.VertexArrayObject;

/**
 * A Vertex Array Object is an only OpenGL Object that stores all of the state needed to supply vertex
 * data (with one minor exception noted below). It stores the format of the vertex data as well as the
 * Buffer Objects providing the vertex data arrays. Note that Vao's do not copy, freeze
 * or store the contents of the referenced buffers - if you change any of the data in the buffers
 * referenced by an existing Vao, those changes will be seen by users of the Vao.
 */
public class GLVertexArrayObject extends VertexArrayObject
{
	/**It's id / address to this vertex array object.*/
	private int id;
	/**This is list with vertex buffers to memory management.*/
	private ArrayList<VertexBufferObject> vbos = new ArrayList<VertexBufferObject>();
	/**This is list with index buffers to memory management.*/
	private ArrayList<IndexBufferObject>  ibos = new ArrayList<IndexBufferObject>();
	/**This is list with index buffers to memory management.*/
	private ArrayList<BufferImpl>  unks = new ArrayList<BufferImpl>();
	/**Check is this vertex array object is selected / bounded.*/
	private boolean selected = false;
	/**Check if this array is created / generated by open gl.*/
	private boolean created = false;
	
	/**
	 *	Basic constructor.	
	 */
	public GLVertexArrayObject() 
	{
		this.create();	
	}
	
	
	/**
	 * Basic destructor. Delete all buffers associated with this
	 * vertex array.
	 */
	@Override
	public void destroyVertexArrayObject()
	{
		for (int i = 0; i < this.vbos.size(); i++)
		{
			this.vbos.get(i).destroyVertexBufferObject();
		}
		
		for (int i = 0; i < this.ibos.size(); i++)
		{
			this.ibos.get(i).destroyIndexBufferObject();
		}

		this.vbos.clear();
		this.ibos.clear();
		this.destroy();
	}
	
	/**
	 * Creates vertex array names id and automaticlly bind it.
	 */
	@Override
	public void create() 
	{
		if (!this.created)
		{
			this.id = GLHelper.hglCreateVertexArrays();
			this.bind();
			this.created = true;
		}
		else
		{
			CTX_ENGINE_ERROR("Vertex Array is already created from this reference." +
							 "If your want to re-create array, use destroy() and then create()."); System.exit(-1);
		}	
	}
	
	/**
	 * Destroy vertex array names id.
	 */
	@Override
	public void destroy() 
	{
		if (this.created)
		{
			this.unBind();
			GLHelper.hglDeleteVertexArrays(this.id);
			this.created = false;
		}
		else
		{
			CTX_ENGINE_ERROR("Vertex Array is not created from this reference." +
							 "Use create() to create array."); System.exit(-1);
		}
	}
	
	/**
	 * Bind this vertex array object.
	 */
	@Override
	public void bind() 
	{
		if(!this.selected)
		{
			GLHelper.hglBindVertexArray(this.id);
			this.selected = true;
		}
	}

	/**
	 * Unbind this vertex array object.
	 */
	@Override
	public void unBind() 
	{
		if(this.selected)
		{
			GLHelper.hglBindVertexArray(this.id);
			this.selected = false;
		}
	}
	
	/**
	 * Enable attribute with specific index add it to this vertex array with glVertexAttribPointer
	 * command. This function takes id of attribute basically index, attribute object to get's to all
	 * attribute data, and buffer stride.
	 */
	public void addAttribute(int attributeId, final VertexAttribute attribute,
		 int bufferStride)
	{
		GLHelper.hglEnableVertexAttribArray(attributeId);
		GLHelper.hglVertexAttribPointer
		(
			attributeId,
			attribute.getElementAttribSize(),
			attribute.getType(),
			attribute.isNormalized() ? true : false,
			bufferStride,
			attribute.getOffset()//(const void*)attribute.getOffset()
		);
	}
	
	/**
	 * Delete's already exist attrib attribute from array.
	 */
	public void deleleAttribute(int attributeId)
	{
		GLHelper.hglDisableVertexAttribArray(attributeId);
	}

	/**
	 * Select / bind array and vertex buffer to begin use, then for each attribute's data
	 * element in buffer create actuall attribute pointer, and finally put vertex buffer object
	 * to array. After this operation deselect / unbind vertex buffer and array.
	 * <p>
	 * If size of layout attributes be equals zero or if vertex array doesn't exist o
	 * created then throw exception.
	 */
	@Override
	public void putBuffer(VertexBufferObject buffer) 
	{
		if (this.created)
		{
			if (!this.isSelected())
			{
				this.bind();
			}

			if (buffer.getLayout().getAttributes().size() == 0)
			{
				CTX_ENGINE_ERROR("Vertex buffer layout (attribute) has no elements!");
				System.exit(-1);
			}

			if (!buffer.isSelected())
			{
				buffer.bind(); //maybe handle error, because maybe this fn unbind buffer
			}

			int attributeId = 0;
			for (final VertexAttribute attribute : buffer.getLayout().getAttributes())
			{
				this.addAttribute(attributeId, attribute, buffer.getLayout().getStride());
				attributeId++;
			}

			//how it be before (on java) it add vertex buffer to list vbo's to
			//memory management.
			this.vbos.add(buffer);

			if (buffer.isSelected())
			{
				this.unBind();
			}

			if (this.isSelected())
			{
				this.unBind();
			}
		}
		else
		{
			CTX_ENGINE_ERROR("Vertex array doesn't created!");
			System.exit(-1);
		}
	}
	
	/**
	 * Select / bind array and index buffer to begin use, then put index buffer object
	 * to array. After this operation deselect / unbind index buffer and array.
	 *<p>
	 * If if vertex array doesn't exist or created then throw exception.
	 */
	@Override
	public void putBuffer(IndexBufferObject buffer) 
	{
		if (this.created)
		{
			if (!this.isSelected())
			{
				this.bind();
			}

			if (!buffer.isSelected())
			{
				buffer.bind();  //maybe handle error, because maybe this fn unbind buffer
			}

			// add index buffer to list ibo's to
			//memory management.
			this.ibos.add(buffer);

			//index's don't need to unbind.
			//this->unBind();
		}
		else
		{
			CTX_ENGINE_ERROR("Vertex array doesn't created!");
			System.exit(-1);
		}
	}
	
	@Override
	public void putBuffer(BufferImpl buffer) 
	{
		if (this.created)
		{
			// add buffer to list to
			//memory management.
			if (buffer.getType() == GL_ARRAY_BUFFER || buffer instanceof GLVertexBufferObject)
			{
				this.putBuffer((VertexBufferObject)buffer);
			}
			else if (buffer.getType() == GL_ELEMENT_ARRAY_BUFFER || buffer instanceof GLIndexBufferObject)
			{
				this.putBuffer((IndexBufferObject)buffer);
			}
			else
			{
				this.unks.add(buffer);
			}
		}
		else
		{
			CTX_ENGINE_ERROR("Vertex array doesn't created!");
			System.exit(-1);
		}
	}
	
	/**
	 * Return the vector (list) with all vertex buffers used by this vertex array.
	 */
	@Override
	public final ArrayList<VertexBufferObject> getVertexBuffers() 
	{
		return this.vbos;
	}

	/**
	 * Return the vector (list) with all index buffers used by this vertex array.
	 */
	@Override
	public final ArrayList<IndexBufferObject> getIndexBuffers() 
	{
		return this.ibos;
	}
	
	/**
	 * Return the vector (list) with all buffers used by this vertex array.
	 */
	@Override
	public final ArrayList<BufferImpl> getBuffers() 
	{
		return this.unks;
	}
	
	/**
	 * Return true if this buffer is selected.
	 */
	@Override
	public boolean isSelected() 
	{
		return this.selected;
	}	
}