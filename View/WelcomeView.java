package passport.View;

import passport.controller.WelcomeController;

public class WelcomeView {
	public void showWelcome() {
		System.out.println("===================��ӭʹ����������ͨ��֤����ƽ̨===================");
		System.out.println("1,��ӵ���ͨ��֤");
		System.out.println("2,ɾ������ͨ��֤");
		System.out.println("3,��˵���ͨ��֤");
		System.out.println("4,��ѯ��������ͨ��֤");
		System.out.println("5,��ѯ���е���ͨ��֤");
		System.out.println("6,��ѯ����е���ͨ��֤");
		System.out.println("7,�˳�ϵͳ");
		System.out.println("==================================================================");
		
		new WelcomeController().dealWelcome();
	}

}
