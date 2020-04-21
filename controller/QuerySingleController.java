package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;
//查找单个电子通行证controller
public class QuerySingleController {
	public void dealQuery() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要查询的手机号/姓名/车牌号");
		String search=sc.next();
	
		//调用dao层代码
		Passport p=new passportDao().queryBysearch(search);
		//判断跳转
		if(p!=null) {
			//添加成功，输出查找结果
			System.out.println(p);
			
		}else {
			//添加失败
			System.out.println("查找失败");
			
		}
		new WelcomeView().showWelcome();
	}

}
