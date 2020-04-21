package passport.View;

import passport.controller.DeleteController;

public class DeleteView {
	public void deleteshow() {
		System.out.println("------------删除电子通行证-----------------");
		new DeleteController().dealdelete();
	}

}
