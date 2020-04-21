package passport.View;

import passport.controller.AddController;

//添加视图
public class AddView {
	public void showAdd() {
		System.out.println("----------添加电子通行证----------");
		//调用对应controller
		new AddController().dealAdd();
		
		
	}

}
