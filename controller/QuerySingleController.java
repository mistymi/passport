package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;
//���ҵ�������ͨ��֤controller
public class QuerySingleController {
	public void dealQuery() {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫ��ѯ���ֻ���/����/���ƺ�");
		String search=sc.next();
	
		//����dao�����
		Passport p=new passportDao().queryBysearch(search);
		//�ж���ת
		if(p!=null) {
			//��ӳɹ���������ҽ��
			System.out.println(p);
			
		}else {
			//���ʧ��
			System.out.println("����ʧ��");
			
		}
		new WelcomeView().showWelcome();
	}

}
