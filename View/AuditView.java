package passport.View;

import passport.controller.AuditController;

public class AuditView {
	public void AuditView() {
		System.out.println("------------审核电子通行证-------------------");
		new AuditController().dealAudit();
	}

}
