package passport.View;

import passport.controller.QueryAllController;

public class QueryAllView {
	public void showquery() {
		System.out.println("--------------���е���ͨ��֤-----------------------");
		new QueryAllController().dealquery();
	}

}
