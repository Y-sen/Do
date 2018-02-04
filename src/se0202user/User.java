package se0202user;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
	private static  List<User> list = new ArrayList<>();
	
	private String name;
	private String sex;
	private int number;
	

	
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public boolean addUser(User user){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:\n");
		String name = sc.nextLine();
		user.setName(name);
		System.out.println("�������Ա� :\n");
		String sex = sc.nextLine();
		user.setSex(sex);
		System.out.println("������ѧ�ţ�\n");
		int number = sc.nextInt();
		if(numEffevtive(number)){
			user.setNumber(number);
		}else{
			System.out.println("ѧ���ظ���");
			return false;
		}
		list.add(user);
		System.out.println("adduser successful!");
		return true;
		}catch(Exception e){
			System.out.println("�������");
			return false;
		}
	}
	public boolean alterUser(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ�ţ�");
			int number = sc.nextInt();
			int index = index(number);
			if(index!=9999){
				System.out.println("����������:");
				String name = sc.next();
				list.get(index).setName(name);
				System.out.println("�������Ա� :");
				String sex = sc.next();
				list.get(index).setSex(sex);
				System.out.println("�޸ĳɹ�");
				return true;
			}else{
				System.out.println("���û�������");
				return false;
			}

		}catch(Exception e){
			System.out.println("�������");	
			return false;
		}
	}
	public boolean removeUser(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ�ţ�");
			int number = sc.nextInt();
			int index = index(number);
			if(index!=9999){
				list.remove(index);

				System.out.println("ɾ���ɹ�");
				return true;
			}else{
				System.out.println("���û�������");
				return false;
			}

		}catch(Exception e){
			System.out.println("�������");	
			return false;
		}
	}
	public boolean serchUser(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ�ţ�");
			int number = sc.nextInt();
			int index = index(number);
			if(index!=9999){
				System.out.println("����"+list.get(index).getName()+"\t�Ա�"+list.get(index).getSex()+"\tѧ��"+list.get(index).getNumber());
				return true;
			}else{
				System.out.println("���û�������");
				return false;
			}

		}catch(Exception e){
			System.out.println("�������");	
			return false;
		}
	}
	public static void displayUser(){
		for(int i=0;i<list.size();i++){
			User user = list.get(i);
			System.out.println("����"+user.getName()+"\t�Ա�"+user.getSex()+"\tѧ��"+user.getNumber());
		}	
	}
	public  int index(int number){
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNumber()==number){
				return i;
			}
		}
		return 9999;
	}
	public boolean numEffevtive(int num){
		int number = num;
		for(int i=0;i<list.size();i++){
			if(list.get(i).getNumber()==number){
				return false;
			}
		}
		return true;
	}

}

