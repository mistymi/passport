package passport.controller;

import java.util.Scanner;

import passport.View.WelcomeView;
import passport.dao.passportDao;

public class AuditController {
	public void dealAudit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("���������ͨ���ĵ���ͨ��֤���ֻ���");
		String id=sc.next();
		
		//����dao��
		int i=new passportDao().audit(id);
		//�ж�
		if(i>0) {
			System.out.println("ͨ����˳ɹ���");
		}else {
			System.out.println("ͨ�����ʧ�ܣ�");
		}
		new WelcomeView().showWelcome();
		
	}

}
