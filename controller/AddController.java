package passport.controller;

import java.util.Scanner;

import passport.View.AddView;
import passport.View.WelcomeView;
import passport.dao.passportDao;
import passport.entity.Passport;

public class AddController {
	public void dealAdd() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������������");
		String name=sc.next();
		System.out.println("�������ֻ��ţ�");
		String id=sc.next();
		System.out.println("�����복�ƺţ�");
		String carnumber=sc.next();
		System.out.println("������סַ��");
		String address=sc.next();
		
		//�����ݷ�װ�������У����㴫��
		Passport p=new Passport(id,name,carnumber,address,null,"�����");
		
		//����dao�����
		int i=new passportDao().add(p);
		//�ж���ת
		if(i>0) {
			//��ӳɹ�����ת�ػ�ӭ����
			System.out.println("��ӵ���ͨ��֤�ɹ���");
			new WelcomeView().showWelcome();
		}else {
			//���ʧ�ܣ���תΪ��ӽ���
			System.out.println("��ӵ���ͨ��֤ʧ�ܣ�");
			new AddView().showAdd();
		}
	}
	

}
