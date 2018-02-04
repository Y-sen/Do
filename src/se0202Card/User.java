package se0202Card;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class User {
	private String name;
	private Integer age;
	
	Card card;
//	public User(String name){
//		this.name = name;
//	}
	private static Map<Card,User> umap = new HashMap<>();
	
	public Card getCard() {
		return card;
	}
	public void addCard(Card card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void add(){
		
	}
	
	public boolean addUser(String name){
//		User use = new User(name);
		return true;
	}
	
	//***************************************************************************
	public boolean addUser(User user,Card card){
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëĞÕÃû:\n");
		String name = sc.nextLine();
		user.setName(name);
		System.out.println("ÇëÊäÈëÄêÁä:\n");
		Integer age = sc.nextInt();
		user.setAge(age);
		System.out.println("ÇëÊäÈë¿¨ºÅ:\n");
		Integer cardID = sc.nextInt();
		card.setCardId(cardID);;
		umap.put(card, user);
		card.addCard(card);
		System.out.println("adduser successful!");
		return true;
		}catch(Exception e){
			System.out.println("ÊäÈë´íÎó");
			return false;
		}
	}
	public boolean savemoney(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("ÇëÊäÈë¿¨ºÅ£º");
			Integer integ = sc.nextInt();
			System.out.println("ÇëÊäÈë½ğ¶î£º");
			Integer number = sc.nextInt();
		
			if(Card.idExist(integ)){
				card.getCard(integ).save(number);
			}else{
				System.out.println("the cardid is empty!");
			}
			return true;
		}catch(Exception e){
			System.out.println("ÊäÈë´íÎó");
			return false;
		}
	}
	public boolean drawmoney(){
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("ÇëÊäÈë¿¨ºÅ£º");
			Integer integ = sc.nextInt();
			System.out.println("ÇëÊäÈë½ğ¶î£º");
			Integer number = sc.nextInt();
			if(Card.idExist(integ)){
				Card.getCard(integ).draw(number);
			}else{
				System.out.println("the cardid is empty!");
			}
			return true;
		}catch(Exception e){
			System.out.println("ÊäÈë´íÎó");
			return false;
		}
	}
	
	
	
	public boolean exist(String name,Card card){
		String uname = name;
		Card ucard = card;
		if(umap.get(ucard).getName().equals(uname)){
			return true;
		}
//		for(int i=0; i<ulist.size(); i++){
//			if(uname.equals(ulist.get(i).getName())&&carid==ulist.get(i).getCard().getCardId()){
//				return true;
//			}
//		}
		return false;
	}
	
	
	public void transfer(Card card, String name, Integer number){
		
		Card mcard = card;
		String uname = name;
		Integer num = number;
		if(exist(uname,mcard)){
			this.card.draw(this.card,num);
			mcard.save(mcard,num);
		}
		System.out.println("±¾¿¨Ê£Óà½ğ¶î£º"+this.card.getRemain());
	}
	public static void display(){
		Set<Map.Entry<Card,User>> entrySet = umap.entrySet();
		Iterator<Map.Entry<Card,User>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<Card,User> me = it.next();
			Card key = me.getKey();
			User value = me.getValue();
			System.out.println("¿¨ºÅ:"+key.getCardId()+"\t\tÕË»§Óà¶î:"+key.getRemain() +"\t\tÓÃ»§Ãû:"+value.getName());
		}
	}
}
