package se0202user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		User ad = new User();
		
		System.out.println("**********�û�����ϵͳ**********");
		init();
		while(true){
			Scanner sc = new Scanner(System.in);
			try{
			int c = sc.nextInt();
			switch(c){
				case 1 :  
					{
						User user = new User();
						boolean s = user.addUser(user);
						while(!s){
							s= user.addUser(user);
						}
						break;
					}
				case 2:
				{
					boolean s = ad.alterUser();
					while(!s){
						s= ad.alterUser();
					}

					break;
				}
				case 3:
				{
					boolean s = ad.removeUser();
					while(!s){
						s= ad.removeUser();
					}
					break;
				}
				case 4:
				{
					boolean s = ad.serchUser();
					while(!s){
						s= ad.serchUser();
					}
					break;
				}
				case 5:
				{	
					User.displayUser();
					break;
				}
				default :{
					init();
				}
			}
			}catch(Exception e){
				init();
			}
		}
	}
	public static void init(){
		System.out.println("��ѡ����Ҫִ�еĹ���");
		System.out.println("      1----������û�");
		System.out.println("      2----�޸��û���Ϣ");
		System.out.println("      3----ɾ���û���Ϣ");
		System.out.println("      4----��ѯ�û���Ϣ");
		System.out.println("      5----��ѯ�û���Ϣ");
	}
	public static void demo1(){
//		User user;
		List<User> list = new ArrayList<>();
		System.out.println("**********�û�����ϵͳ**********");
		
			System.out.println("��ѡ����Ҫִ�еĹ���");
			System.out.println("      1----������û�");
			System.out.println("      2----�޸��û���Ϣ");
			System.out.println("      3----ɾ���û���Ϣ");
			System.out.println("      4----��ѯ�û���Ϣ");
			System.out.println("      5----��ѯ�û���Ϣ");
		
		while(true){
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
		
			switch(c){
				case 1 :  
					{
						User user = new User();
						boolean s = user.addUser(user);
						while(!s){
							s= user.addUser(user);
						}
						list.add(user);
						break;
					}
				case 2:
				{
//					
					System.out.println("������ѧ�ţ�\n");
					int number = sc.nextInt();
					int index=9999;
					for(int i=0;i<list.size();i++){
						if(list.get(i).getNumber()==number){
							index=i;
							break;
						}
					}
					if(index!=9999){
						System.out.println("����������:");
						String name = sc.nextLine();
						list.get(index).setName(name);
						System.out.println("�������Ա� :");
						String sex = sc.nextLine();
						list.get(index).setSex(sex);
						System.out.println("�޸ĳɹ�");
					}else{
						System.out.println("���û�������");
					}
					break;
				}
				case 3:
				{
					System.out.println("������ѧ�ţ�\n");
					int number = sc.nextInt();
					int index=9999;
					for(int i=0;i<list.size();i++){
						if(list.get(i).getNumber()==number){
							index=i;
							break;
						}
					}
					if(index!=9999){
						list.remove(index);
						System.out.println("�û�ɾ���ɹ�");
					}else{
						System.out.println("���û�������");
					}
					break;
				}
				case 4:
				{
					System.out.println("������ѧ�ţ�");
					int number = sc.nextInt();
					int index=9999;
					for(int i=0;i<list.size();i++){
						if(list.get(i).getNumber()==number){
							index=i;
							break;
						}
					}
					if(index!=9999){
						System.out.println("����"+list.get(index).getName()+" �Ա�"+list.get(index).getSex()+"  ѧ��"+list.get(index).getNumber());
					}else{
						System.out.println("���û�������");
					}
					break;
				}
				case 5:
				{	
					for(int i=0;i<list.size();i++){
						User user = list.get(i);
						System.out.println("����"+user.getName()+" �Ա�"+user.getSex()+"  ѧ��"+user.getNumber());
					}	
					break;
				}
				default : {
					
				}
				
			}
		}
	}
}
