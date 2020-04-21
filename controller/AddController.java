package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;

public class AddController {
	public void dealAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=sc.next();
		System.out.println("请输入手机号：");
		String id=sc.next();
		System.out.println("请输入车牌号：");
		String carnumber=sc.next();
		System.out.println("请输入住址：");
		String address=sc.next();
		
		//把数据封装到对象中，方便传递
		Passport p=new Passport(id,name,carnumber,address,null,"审核中");
		
		//调用dao层代码
		int i=new passportDao().add(p);
		//判断跳转
		if(i>0) {
			//添加成功，跳转回欢迎界面
			System.out.println("添加电子通行证成功！");
			new WelcomeView().showWelcome();
		}else {
			//添加失败，跳转为添加界面
			System.out.println("添加电子通行证失败！");
			new AddView().showAdd();
		}
	}
	

}
