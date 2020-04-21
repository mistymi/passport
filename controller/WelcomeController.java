package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.AuditView;
import passport.View.DeleteView;
import passport.View.QueryAllView;
import passport.View.QuerySingleView;
import passport.View.UnAuditView;
import passport.View.WelcomeView;

//主界面视图控制
public class WelcomeController {
	public void dealWelcome() {
		//获取用户输入，判断操作
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		switch(input) {
		case "1":
			//添加电子通行证
			new AddView().showAdd();
			break;
		case "2":
			//删除电子通行证
			new DeleteView().deleteshow();
			break;
		case "3":
			//审核电子通行证
			new AuditView().AuditView();
			break;
		case "4":
			//查询单个电子通行证
			new QuerySingleView().showQuery();
			break;
		case "5":
			//查询所有电子通行证
			new QueryAllView().showquery();
			break;
		case "6":
			//查询审核中电子通行证
			new UnAuditView().showUnAudit();
			break;
		case "7":
			//退出系统
			System.exit(0);
			break;
		default:
			//输入错误，跳转回欢迎界面
			System.out.println("您的输入有误，请重新输入");
			new WelcomeView().showWelcome();
		
		}
	}

}
