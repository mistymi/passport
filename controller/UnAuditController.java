package passport.controller;

import java.util.ArrayList;
import java.util.List;

import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;

public class UnAuditController {
	public void dealUnAudit() {
		
		List<Passport> list=new ArrayList<> ();
		
		//����dao�����
		list= new passportDao().queryUnaudit();
		//�ж�
		if(list!=null) {
			for(Passport p: list) {
				System.out.println(p);
			}
		}else {
			System.out.println("�޷���ѯ����˵���ͨ��֤��");
		}
		new WelcomeView().showWelcome();
	}

}
