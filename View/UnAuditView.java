package passport.View;

import passport.controller.UnAuditController;

public class UnAuditView {
	public void showUnAudit() {
		System.out.println("------------����˵���ͨ��֤---------------------");
		new UnAuditController().dealUnAudit();
	}

}
