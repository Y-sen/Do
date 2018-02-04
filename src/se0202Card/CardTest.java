package se0202Card;

import java.util.Scanner;



public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			User user = new User();
			Card card = new Card();
			init();
			Scanner sc = new Scanner(System.in);
			while(true){
				int select = sc.nextInt();
				switch(select){
					case 1:{
						User newuser = new User();
						Card newcard = new Card();
						boolean s = user.addUser(newuser, newcard);
						while(!s){
							s= user.addUser(newuser, newcard);
						}
						
						break;
					}
					case 2:{
						boolean s = false;
						while(!s){
							 s = user.savemoney();
						}
						break;
					}
					case 3:{
						boolean s = false;
						while(!s){
						user.drawmoney();
						}
						break;
					}
					case 4:{
						break;
					}
					case 5:{
						User.display();
						break;
					}
					default :{
						init();
					}
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
		
	}
}
