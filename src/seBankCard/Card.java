package seBankCard;

import java.util.ArrayList;
import java.util.List;


public class Card {

	private Integer cardId;
	private Integer remain=0;
	
	public Card(int cardId){
		this.cardId=cardId;
	}
	
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
	
	public boolean save(Integer remain){
		if(remain<=50000){
			this.remain = this.remain+remain;
			return true;
		}else{
			System.out.println("单笔最大金额为五万元");
			return false;
		}
	}
	public boolean draw(Integer money){
		
//		this.remain = this.remain-money;
		int num = money;
		if(num <= this.remain){
			this.remain = this.remain - num;
			return true;
		}else{
			System.out.println("not enough ");
			return false;
		}
	}
	
}
