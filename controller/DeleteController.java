package passport.controller;

import java.util.Scanner;

import passport.View.WelcomeView;
import passport.dao.passportDao;

public class DeleteController {
	public void dealdelete() {
		//����idɾ��ͨ��֤
		Scanner sc=new Scanner(System.in);
		System.out.println("������Ҫɾ����ͨ��֤���");
		String id=sc.next();
		
		//����dao�����
		int i=new passportDao().delete(id);
		
		//�ж��Ƿ�ɾ���ɹ�
		if(i>0) {
			System.out.println("ɾ���ɹ���");
		}else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
		new WelcomeView().showWelcome();
		
	}

}
