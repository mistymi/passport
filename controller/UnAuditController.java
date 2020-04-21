package passport.controller;

import java.util.ArrayList;
import java.util.List;

import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;

public class UnAuditController {
	public void dealUnAudit() {
		
		List<Passport> list=new ArrayList<> ();
		
		//调用dao层代码
		list= new passportDao().queryUnaudit();
		//判断
		if(list!=null) {
			for(Passport p: list) {
				System.out.println(p);
			}
		}else {
			System.out.println("无法查询待审核电子通行证！");
		}
		new WelcomeView().showWelcome();
	}

}
