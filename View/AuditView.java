package passport.View;

import passport.controller.AuditController;

public class AuditView {
	public void AuditView() {
		System.out.println("------------��˵���ͨ��֤-------------------");
		new AuditController().dealAudit();
	}

}
