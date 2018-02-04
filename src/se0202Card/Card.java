package se0202Card;

import java.util.ArrayList;
import java.util.List;

public class Card {
	private Integer cardId;
	private Integer remain=0;
	
//	public Card(int cardId){
//		this.cardId=cardId;
//	}
	private static List<Card> clist = new ArrayList<>();
	//set  get
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getRemain() {
		return remain;
	}
	public void setRemain(Integer remain) {
		this.remain = remain;
	}
	public void addCard(Card card){
		clist.add(card);
		System.out.println("card add success");
	}
	public static  boolean idExist(int id){
		Integer cardid = id;
		for(int i=0; i<clist.size(); i++){
			if(cardid==clist.get(i).getCardId()){
				return true;
			}
		}
		return false;
	}
	public static Card getCard(Integer id){
		for(int i = 0;i<clist.size();i++){
			if(id==clist.get(i).getCardId()){
				return clist.get(i);
			}
		}
		return null;
	}
	
	
	
	
	//´æÇ®
	public void save(int integer){
		int num = integer;
		this.remain = this.remain + num;
		System.out.println("ÕË»§Óà¶î"+remain);
	}
	public void save(Card card,int integer){
		int num = integer;
		card.setRemain (card.getRemain() + num);
		System.out.println("ÕË»§Óà¶î"+remain);
	}
	//È¡Ç®
	public void draw(int integer){
		int num = integer;
		if(num > this.remain){
			this.remain = this.remain - num;
			System.out.println("draw successful");
		}else{
			System.out.println("not enough ");
		}
	}
	public void draw(Card card,Integer integer){
		int num = integer;
		if(num > remain){
			card.setRemain( card.getRemain() - num);
			System.out.println("draw successful!---remain:"+card.getRemain());
		}else{
			System.out.println("not enough ");
		}
	}
	
	
}
