package passport.View;

import passport.controller.AddController;

//�����ͼ
public class AddView {
	public void showAdd() {
		System.out.println("----------��ӵ���ͨ��֤----------");
		//���ö�Ӧcontroller
		new AddController().dealAdd();
		
		
	}

}
