package se0202user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		User ad = new User();
		
		System.out.println("**********用户管理系统**********");
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
		System.out.println("请选择需要执行的功能");
		System.out.println("      1----添加新用户");
		System.out.println("      2----修改用户信息");
		System.out.println("      3----删除用户信息");
		System.out.println("      4----查询用户信息");
		System.out.println("      5----查询用户信息");
	}
	public static void demo1(){
//		User user;
		List<User> list = new ArrayList<>();
		System.out.println("**********用户管理系统**********");
		
			System.out.println("请选择需要执行的功能");
			System.out.println("      1----添加新用户");
			System.out.println("      2----修改用户信息");
			System.out.println("      3----删除用户信息");
			System.out.println("      4----查询用户信息");
			System.out.println("      5----查询用户信息");
		
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
					System.out.println("请输入学号：\n");
					int number = sc.nextInt();
					int index=9999;
					for(int i=0;i<list.size();i++){
						if(list.get(i).getNumber()==number){
							index=i;
							break;
						}
					}
					if(index!=9999){
						System.out.println("请输入姓名:");
						String name = sc.nextLine();
						list.get(index).setName(name);
						System.out.println("请输入性别 :");
						String sex = sc.nextLine();
						list.get(index).setSex(sex);
						System.out.println("修改成功");
					}else{
						System.out.println("此用户不存在");
					}
					break;
				}
				case 3:
				{
					System.out.println("请输入学号：\n");
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
						System.out.println("用户删除成功");
					}else{
						System.out.println("此用户不存在");
					}
					break;
				}
				case 4:
				{
					System.out.println("请输入学号：");
					int number = sc.nextInt();
					int index=9999;
					for(int i=0;i<list.size();i++){
						if(list.get(i).getNumber()==number){
							index=i;
							break;
						}
					}
					if(index!=9999){
						System.out.println("姓名"+list.get(index).getName()+" 性别："+list.get(index).getSex()+"  学号"+list.get(index).getNumber());
					}else{
						System.out.println("此用户不存在");
					}
					break;
				}
				case 5:
				{	
					for(int i=0;i<list.size();i++){
						User user = list.get(i);
						System.out.println("姓名"+user.getName()+" 性别："+user.getSex()+"  学号"+user.getNumber());
					}	
					break;
				}
				default : {
					
				}
				
			}
		}
	}
}
