package passport.View;

import passport.controller.QuerySingleController;

public class QuerySingleView {
	public void showQuery() {
		System.out.println("-----------查询单个电子通行证--------------");
		new QuerySingleController().dealQuery();
	}

}
