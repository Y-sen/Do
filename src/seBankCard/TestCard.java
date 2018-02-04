package seBankCard;

import java.util.Scanner;


public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		init();
		Scanner sc = new Scanner(System.in);
		while(true){
			try{
			int select = sc.nextInt();
			switch(select){
				case 1:{
					//�½��û�
					boolean s = false;
					while(!s){
						System.out.println("�������û�����");
						String name = sc.next();
						System.out.println("�����뿨��");
						Integer cardId = sc.nextInt();
						s = user.addUser(name,cardId);
						if(!s){
							System.out.println("���������룺");
						}
					}
					break;
				}
				case 2:{
					//save money
						boolean s = false;
						while(!s){
						System.out.println("�������û�����");
						String name = sc.next();
						System.out.println("�����뿨��");
						Integer cardId = sc.nextInt();
						System.out.println("����������:");
						Integer moneyNum = sc.nextInt();
						s = user.saveMoney(name, cardId, moneyNum);
						if(!s){
							System.out.println("���������룺");
						}
					}
					break;
				}
				case 3:{
					//draw
						boolean s = false;
						while(!s){
						System.out.println("�������û�����");
						String name = sc.next();
						System.out.println("�����뿨��");
						Integer cardId = sc.nextInt();
						System.out.println("������ȡ����:");
						Integer drawNum = sc.nextInt();
						s = user.drawMoney(name, cardId, drawNum);
						if(!s){
							System.out.println("���������룺");
						}
					}
					break;
				}
				case 4:{
					
						boolean s = false;
						while(!s){
						System.out.println("������ת���˺ţ�");
						Integer scardId = sc.nextInt();
						System.out.println("������ת���˺�:");
						Integer dcardId = sc.nextInt();
						System.out.println("������ת�˽��:");
						Integer MoneyNum = sc.nextInt();
						s = user.transfer(scardId, dcardId, MoneyNum);
						if(!s){
							System.out.println("���������룺");
						}
					}
					break;
				}
				case 5:{
					user.display();
					break;
				}
				default :{
					init();
				}
			}
			}catch(Exception e){
				System.out.println("����������ѡ��");
			}
		}
		
}

public static void init(){
	System.out.println("***********card***********");
	System.out.println("          ��ѡ����");
	System.out.println("         1----����");
	System.out.println("         2----���");
	System.out.println("         3----ȡ��");
	System.out.println("         4----ת��");
	System.out.println("         5----��ѯ");
	
}

}
