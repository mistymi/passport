package passport.View;

import passport.controller.WelcomeController;

public class WelcomeView {
	public void showWelcome() {
		System.out.println("===================欢迎使用社区电子通行证管理平台===================");
		System.out.println("1,添加电子通行证");
		System.out.println("2,删除电子通行证");
		System.out.println("3,审核电子通行证");
		System.out.println("4,查询单个电子通行证");
		System.out.println("5,查询所有电子通行证");
		System.out.println("6,查询审核中电子通行证");
		System.out.println("7,退出系统");
		System.out.println("==================================================================");
		
		new WelcomeController().dealWelcome();
	}

}
