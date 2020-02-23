package com.kenny.craftix.client.language.localization;

import static com.kenny.craftix.client.language.Language.*;

import com.kenny.craftix.client.ClientGetterInformation;
import com.kenny.craftix.server.ServerGetterInformation;

public class LocRu 
{
	protected ClientGetterInformation clientInfo;
	protected ServerGetterInformation serverInfo;
	
	public void loadRuLocalization(ClientGetterInformation clientGetterInformation, ServerGetterInformation serverGetterInformation)
	{
		this.clientInfo = clientGetterInformation;
		this.serverInfo = serverGetterInformation;
		
		CLIENT_VERSION = "������" + this.clientInfo.getClientVersion();
		SERVER_VERSION = "������ C������" + this.serverInfo.getServerVersion();
		PROFILE_INFO_ENIGNE = "��������: " + this.clientInfo.getClientName();
		PROFILE_INFO_VERSION = CLIENT_VERSION;
		PROFILE_INFO_VERSION_TYPE = "��� ������";
		PROFILE_INFO_USERNAME = "�������";
		PROFILE_INFO_USER_ID = "������������ Id";
		PROFILE_INFO_SESSION_ID = "������ Id";
		PROFILE_INFO_HAS_LICENSE = "��������";
		URI_TITLE = "������� �� ������: ";
		CONTINUE = "����������";
		COMPANY = "����� ��������@";
		MAINMENU_SINGLEPLAYER_TITLE = "��������� ����";
		MAINMENU_MULTIPLAYER_TITLE = "������� ����";
		MAINMENU_OPTIONS_TITLE = "���������";
		MAINMENU_CREDITS_TITLE = "������";
		MAINMENU_NEWS_TITLE = "�������";
		PROFILE_TITLE = "�������";
		PROFILE_YOUR_PLAYER = "���� �����";
		MAINMENU_WEBSITE_TITLE = "������ ��";
		MAINMENU_EDITOR = "��������";
		MAINMENU_HAVENT_LICENSE = "�� �� ������� ������, ������ ��� �� ������ ��������! ����� Esc ����� ���������.";
		GUI_BACK = "�����";
		GUI_ALL = "��";
		GUI_CANCEL = "������";
		GUI_CONTINUE = "����������";
		GUI_DONW = "����";
		GUI_NONE = "�����";
		GUI_OFF = "����";
		GUI_ON = "���";
		GUI_RETURN = "���������";
		GUI_UP = "�����";
		GUI_SMALL = "������";
		GUI_NORMAL = "����������";
		GUI_HIGH = "�������";
		GUI_SAVE = "���������";
		GUI_MIN = "���";
		GUI_MAX = "����";
		LATEST_UPDATES_TITLE = "����������";
		NEWS_VERSION_14 = "��� ������: 0.0.12 - 0.0.15b (������)";
		NEWS_LOG_DESC_14 = 
				"- �������� ���� ������������. ���� ���������� � '.craftix'      " + 
				"- ��������� ����������� � ����, ���� ������� � ����������.      " +
				"- ��������� ������ ������� � ����� ����� ���: '����', '�������'," + 
				"'����', � ���-�� ����� ���������.                                      " + 
				"- ������ ��� ��������� ������� �� �������� �����������.         " + 
				"- ��������� ���: ��� ������� �� ������� ���� ���������.           " +
				"- �� ������ ����� ������ ����� ������� � ���� ������.           " +
				"- � ���� � ������� ������ ����� ����������� ������ ������.                         " +
				"                                                                                   " +
				"- ��������� ������� ����� (�����) � ����. ���� ������ ��������," +
				"������ � ������� ���� � � ������ �����.";
		NEWS_VERSION_17 = "��� ������: 0.0.17";
		NEWS_LOG_DESC_17 = "��������...";
		ENGINE_INFO_TITLE =  "���������� �� ������ Craftix";
		FILE_CONFIG_ERROR = "���� ������������ �� ��������!";
		OPTION_FULLSCREEN = "������ �����";
		OPTION_POST_EFFECTS = "���� �������";
		OPTION_POST_EFFECTS_MORE = "�������������� ���� �������";
		OPTION_POST_EFFECTS_MORE_CONTRAST = "��������";
		OPTION_POST_EFFECTS_MORE_BRIGHT_FILTER = "����� ����";
		OPTION_POST_EFFECTS_MORE_GAUSSIAN_BLUR = "��������";
		OPTION_GUI_SCALE = "������ Gui";
		OPTION_FOG = "�����";
		OPTION_RENDER_DISTANCE = "���������� ����";
		OPTION_RENDER_SKYBOX = "������ ����";
		OPTION_RENDER_WATER = "������ ����";
		OPTION_SHADOWS = "����";
		OPTION_MAX_FPS = "����� FPS";
		OPTION_VSYNC = "VSync";
		OPTION_PARTICLES = "��������";
		OPTION_BRIGHTNESS = "�������";
		FBO = "����� ������";
		TRIANGLE_MODE = "����������� ���";
		SOON_AUDIO = "����� ��������� �����!";
		CREDITS_DESC = "���� ������� ������ ��� ������ �����(����� ���������) � ��������� �����@. ������ ������ ��������� �� ����� ������ ������ ����������, ������� ����� �� ���� ����-�� ������������������� � ����� �� �����. ���� ���-�� ������� ������ �������, � ���� ����� �����������. � ��� ��� ��������� �� ���� ��������.";
		MULTIPLAYER_CREATE_SERVER = "������� C�����";
		MULTIPLAYER_CONNECT_TO_SERVER = "������������ � C������";
		CONNECTING_TITLE = "�����������";
		CONNECTING_CHECK_IP = "�������� Ip-������";
		CONNECTING_SERVER_WAIT_CLIENT = "�������� �������";
		CONNECTING_SERVER_CLIENT_CONNECT = "������ �����������";
		CONNECTING_CLIENT_JOIN_SERVER = "����� �� ������";
		CONNECTING_CLIENT_JOINED = "������� �����";
		DISCONNECTING_TITLE = "������������";
		DISCONNECTING_BACK_TO_MENU = "���������";
		DISCONNECTING_QUIT = "�����";
		DISCONNECTING_CLINET_UN_IP = "�� �� ������ ������������ � �������, ��� ��� ��� IP-����� ����������";
		DISCONNECTING_SERVER_UN_IP = "�� �� ������ ������� ������, ������ ��� ��� IP-����� ����������.";
		LOAD_WORLD = "��������� ���";
		GEN_WORLD = "������� ���";
		GEN_LP_WORLD = "������� ���-���� ���";
		GEN_F_WORLD = "������� ������� ���";
		GEN_E_WORLD = "������� ������ ���";
		CREATE_WORLD_TITLE = "������� ���";
		CREATE_WORLD_CREATE = "�������";
		CREATE_WORLD_WORLD_NAME = "��� ����";
		CREATE_WORLD_SAVE_AS = "��������� �";
		CREATE_WORLD_GAMEMODE = "����� ����";
		CREATE_WORLD_WORLD_TYPE = "��� ����";
		CREATE_WORLD_WORLD_SEED = "��� ����";
		CREATE_WORLD_OTHER_SETTINGS = "������ ������������";
		MAINMENU_QUIT_TITLE = "����� �� ����";
		QUIT_GAME = "����� �� ����";
		GRAPHICS_TITLE = "�������";
		AUDIO_TITLE = "�����/����";
		LANGUAGE_TITLE = "����";
		OTHER_TITLE = "��������� ���������";
		OPENGL_SETTINGS_TITLE = "Open Gl ���������";
		FOV = "Fov: ";
		LANG_DESC = "�������� ������ ��� ����:";
		LANG_EN = "����������";
		LANG_RU = "�������";
		OPTION_CHANGE_DESC = "���� ��� ��������� �����������, ������������� ����.";
		RESOLUTION = "���������� ������:";
		SCREEN_1600x900 = "1600x900";
		SCREEN_1280x720 = "1280x720";
		SCREEN_1200x600 = "1200x600";
		SCREEN_640x540 = "640x540";
		AUDIO_ON_OFF = "���/���� ����: ";
		QUIT_GAME_DESC = "�� ������������� ������ ����� �� ����?";
		RETURN = "���������";
		RESPAWN = "�����������";
		OTHER_TITLE = "��������� ���������";
		OTHER_FPS_TAB = "Fps � ����";
		OTHER_RENDER_CURSOR = "������ �������";
		CONTROLS_TITLE = "����������";
		CONTROLS_CONTROL_FORWARD = "���� �����";
		CONTROLS_CONTROL_BACKWARD = "���� �����";
		CONTROLS_CONTROL_LEFTWARD = "���� ������";
		CONTROLS_CONTROL_RIGHTWARD = "���� �������";
		CONTROLS_CONTROL_JUMP = "������";
		CONTROLS_CONTROL_RUN = "���";
		CONTROLS_CONTROL_INVENTORY = "���������";
		CONTROLS_CONTROL_PICKUP = "���������";
		CONTROLS_CONTROL_PAUSE = "�����";
		CONTROLS_CONTROL_PLAYERTAB = "���� �������";
		CONTROLS_CONTROL_INFOPAGE = "����������";
		CONTROLS_SELECT_CONTROL_DESC = "������� �� �� ������� ������� ������ �������� � ������� ���������.";
		GL_SETTINGS_DESC = "��� ���������� ���������� ��� � ���, ����� ���� ����� ���������� ������ ��� ��� ��������� � Open GL";
		GL_SETTINGS_ARB_VBO = "Arb ������ ������";
		GL_SETTINGS_VBO = "������ ������";
		GL_SETTINGS_MULTITEXTURE = "���������������������";
		GL_SETTINGS_TEXTURE_COMBINE = "�������� ���������� Arv";
		GL_SETTINGS_SHADERS = "�������";
		GL_SETTINGS_FRAMEBUFFER = "������ �������";
		GL_SETTINGS_GL14 = "������ GL 14";
		GL_SETTINGS_GL21 = "������ GL 21";
		GL_ERROR_SHADER_NO_SHADERS = "�� ��������������� �������! �������� OpenGl ��� �������� �����.";
		GL_ERROR_2 = "�� ��������������� '400 core' ������ ��������!";
		GL_ERROR_3 = "���������� ������ OpenGL. ���������� 3.0 +.";
		GL_ERROR_4 = "";
		GL_ERROR_5 = "";
		LOADING_WORLD = "�������� ����";
		LOADING_BUILDING_TERRAIN = "���������� ���������";
		LOADING_GENERATE_TERRIAN = "��������� ���������";
		LOADING_PROCESSING_ENTITY = "��������� ��������";
		LOADING_SAVING_WORLD = "���������� ����";
		GAMEPAUSE_TITLE = "�����";
		GAMEPAUSE_RESUME = "�����������";
		GAMEPAUSE_OPTIONS = "���������";
		GAMEPAUSE_SAVE_WORLD = "��������� ���";
		GAMEPAUSE_HELP = "������";
		GAMEPAUSE_BACK_MENU = "� ������� ����";
		GAMEPAUSE_SAVE_AND_EXIT = "�����";
		GAMEOVER_TITLE = "���� ��������";
		GAMEOVER_RESPAWN = "�����������";
		GAMEOVER_BACK_TO_MENU = "� ����";
		GAMEOVER_REASON_HEALTH = "�� ������ �� �� �������� ��������.";
		GAMEOVER_REASON_COMMAND = "�� ���� ������� �� ����� ����.";
		GAMEOVER_REASON_WATER = "�� ����������� � ������� ��������.";
		EDITOR_SWITCH = "�� ������������� ������ ������� � ���� ��������?";
		
	}
}
