package passport.View;

import passport.controller.QuerySingleController;

public class QuerySingleView {
	public void showQuery() {
		System.out.println("-----------��ѯ��������ͨ��֤--------------");
		new QuerySingleController().dealQuery();
	}

}
