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
					//新建用户
					boolean s = false;
					while(!s){
						System.out.println("请输入用户名：");
						String name = sc.next();
						System.out.println("请输入卡号");
						Integer cardId = sc.nextInt();
						s = user.addUser(name,cardId);
						if(!s){
							System.out.println("请重新输入：");
						}
					}
					break;
				}
				case 2:{
					//save money
						boolean s = false;
						while(!s){
						System.out.println("请输入用户名：");
						String name = sc.next();
						System.out.println("请输入卡号");
						Integer cardId = sc.nextInt();
						System.out.println("请输入存款金额:");
						Integer moneyNum = sc.nextInt();
						s = user.saveMoney(name, cardId, moneyNum);
						if(!s){
							System.out.println("请重新输入：");
						}
					}
					break;
				}
				case 3:{
					//draw
						boolean s = false;
						while(!s){
						System.out.println("请输入用户名：");
						String name = sc.next();
						System.out.println("请输入卡号");
						Integer cardId = sc.nextInt();
						System.out.println("请输入取款金额:");
						Integer drawNum = sc.nextInt();
						s = user.drawMoney(name, cardId, drawNum);
						if(!s){
							System.out.println("请重新输入：");
						}
					}
					break;
				}
				case 4:{
					
						boolean s = false;
						while(!s){
						System.out.println("请输入转出账号：");
						Integer scardId = sc.nextInt();
						System.out.println("请输入转入账号:");
						Integer dcardId = sc.nextInt();
						System.out.println("请输入转账金额:");
						Integer MoneyNum = sc.nextInt();
						s = user.transfer(scardId, dcardId, MoneyNum);
						if(!s){
							System.out.println("请重新输入：");
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
				System.out.println("请输入数字选项");
			}
		}
		
}

public static void init(){
	System.out.println("***********card***********");
	System.out.println("          请选择功能");
	System.out.println("         1----开户");
	System.out.println("         2----存款");
	System.out.println("         3----取款");
	System.out.println("         4----转账");
	System.out.println("         5----查询");
	
}

}
