package passport.controller;

import java.util.Scanner;

import passport.View.WelcomeView;
import passport.dao.passportDao;

public class AuditController {
	public void dealAudit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入审核通过的电子通行证的手机号");
		String id=sc.next();
		
		//调用dao层
		int i=new passportDao().audit(id);
		//判断
		if(i>0) {
			System.out.println("通过审核成功！");
		}else {
			System.out.println("通过审核失败！");
		}
		new WelcomeView().showWelcome();
		
	}

}
