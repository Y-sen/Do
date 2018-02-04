package seBankCard;

import java.util.ArrayList;
import java.util.List;


public class User {
	private String name;
	private Integer age;
	private Card card;
	private static List<User> ulist = new ArrayList<>();
	private static List<Card> clist = new ArrayList<>();
	public User(){
		
	}
	public User(String name){
		this.name = name;
	}
	
	
	
	public Card getCard() {
		return card;
	}
	public boolean addCard(Integer cardId) {
		if(!effectId(cardId)){
			this.card = new Card(cardId);
			return true;
		}else{
			System.out.println("卡号已存在，请重新输入");
			return false;
		}
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
	
	public User findUser(String name){
		for(int i = 0; i<ulist.size();i++){
			User use = ulist.get(i);
			if(use.getName().equals(name)){
				return ulist.get(i);
			}
		}
		return null;
	}
	public boolean effectUser(String name){
		for(int i = 0; i<ulist.size();i++){
			if(ulist.get(i).getName().equals(name)){
				return true;
			}
		}
		return false;
	}
	public boolean effectId(Integer cardId){
		for(int i = 0; i<clist.size();i++){
			if(clist.get(i).getCardId()==cardId){
				return true;
			}
		}
		return false;
	}
	public Card findCard(Integer cardId){
		for(int i = 0; i<clist.size();i++){
			if(clist.get(i).getCardId()==cardId){
				return clist.get(i);
			}
		}
		return null;
	}
	public boolean transfer(Integer sCardId,Integer dCardId,Integer moneyNum){
		Object obj = new Object();
		try{
			Card scard = findCard(sCardId);
			Card dcard = findCard(dCardId);
			synchronized(obj){
				if(scard.draw(moneyNum)&&dcard.save(moneyNum)){
					System.out.println("transferring success");
					return true;
				}else{
					System.out.println("转账失败");
					return false;
				}
			}
		}catch(Exception e){
			System.out.println("transferring  falid");
			return false;
		}
	}
	public boolean saveMoney(String name,Integer cardId,Integer moneyNum){
		try{
			User user = findUser(name);
			Card card = user.getCard();
			if(card.getCardId()==cardId){
				System.out.println(card.getCardId());
				card.save(moneyNum);
				System.out.println("save success");
				return true;
			}else{
				System.out.println("cardId is null");
				return false;
			}
		}catch(Exception e){
			System.out.println("creat user  falid");
			return false;
		}
	}
	public boolean drawMoney(String name,Integer cardId,Integer moneyNum){
		try{
			User user = findUser(name);
			Card card = user.getCard();
			if(card.getCardId()==cardId){
				if(card.draw(moneyNum)){
					System.out.println("取款成功");
					return true;
				}else{
					System.out.println("余额不足");
					return false;
				}
			}else{
				System.out.println("cardId is null");
				
				return false;
			}
		}catch(Exception e){
			System.out.println("draw faild");
			return false;
		}
	}
	public boolean addUser(String name,Integer cardId){
		try{
			if(!effectUser(name)){
				User user = new User(name);
				if(user.addCard(cardId)){
					ulist.add(user);
					clist.add(user.card);
					System.out.println("cread user success!");
					return true;
				}else{
					return false;
				}
			}else{
				System.out.println("用户名已存在");
				return false;
			}
		}catch(Exception e){
			System.out.println("creat user  falid");
			return false;
		}
	}
	public   void display(){
		for(int i = 0; i<ulist.size();i++){
			User use = ulist.get(i);
			System.out.println("用户名:"+use.getName()+"\t\t卡号:"+use.getCard().getCardId()+"\t\t余额:"+use.getCard().getRemain());
		}
	}
}
