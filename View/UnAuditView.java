package passport.View;

import passport.controller.UnAuditController;

public class UnAuditView {
	public void showUnAudit() {
		System.out.println("------------待审核电子通行证---------------------");
		new UnAuditController().dealUnAudit();
	}

}
