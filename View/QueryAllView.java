package passport.View;

import passport.controller.QueryAllController;

public class QueryAllView {
	public void showquery() {
		System.out.println("--------------所有电子通行证-----------------------");
		new QueryAllController().dealquery();
	}

}
