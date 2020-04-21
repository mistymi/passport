package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.AuditView;
import passport.View.DeleteView;
import passport.View.QueryAllView;
import passport.View.QuerySingleView;
import passport.View.UnAuditView;
import passport.View.WelcomeView;

//��������ͼ����
public class WelcomeController {
	public void dealWelcome() {
		//��ȡ�û����룬�жϲ���
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		switch(input) {
		case "1":
			//��ӵ���ͨ��֤
			new AddView().showAdd();
			break;
		case "2":
			//ɾ������ͨ��֤
			new DeleteView().deleteshow();
			break;
		case "3":
			//��˵���ͨ��֤
			new AuditView().AuditView();
			break;
		case "4":
			//��ѯ��������ͨ��֤
			new QuerySingleView().showQuery();
			break;
		case "5":
			//��ѯ���е���ͨ��֤
			new QueryAllView().showquery();
			break;
		case "6":
			//��ѯ����е���ͨ��֤
			new UnAuditView().showUnAudit();
			break;
		case "7":
			//�˳�ϵͳ
			System.exit(0);
			break;
		default:
			//���������ת�ػ�ӭ����
			System.out.println("����������������������");
			new WelcomeView().showWelcome();
		
		}
	}

}
