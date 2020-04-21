package passport.controller;

import java.util.Scanner;

import passport.View.WelcomeView;
import passport.dao.passportDao;

public class DeleteController {
	public void dealdelete() {
		//根据id删除通行证
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要删除的通行证编号");
		String id=sc.next();
		
		//调用dao层代码
		int i=new passportDao().delete(id);
		
		//判断是否删除成功
		if(i>0) {
			System.out.println("删除成功！");
		}else {
			System.out.println("删除失败！");
		}
		new WelcomeView().showWelcome();
		
	}

}
