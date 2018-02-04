package seCard;

import java.util.Random;

public class Pcard {

	Cardplayer player;
	static final String[] str = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	static final String[] pic = {"♦","♥","♠","♣"};
//	static String[] pic = {"方片","红心","黑桃","梅花"};
	static String[] card = new String[54];
	int count = 0;

	
	public void shuff(){
		Random r = new Random();
		for(int i = card.length-1;i>0;i--){
			int rad = r.nextInt(i);
			String tem = card[i];
			card[i] = card[rad];
			card[rad] = tem;
		}

//		for (int i = 0; i < 54; i++) {
//			int num_1 = r.nextInt(54);
//			int num_2 = r.nextInt(54);
//			String tem = card[num_1];
//			card[num_1] = card[num_2];
//			card[num_2] = tem;
//		}
		
		
	}
	public void init(){
		String s = null;
		for(int i = 0;i<pic.length;i++){
			for(int j = 0;j<str.length;j++){
				s = pic[i]+str[j];
				card[count] = s;
				count++;
				
			}
		}
		card[52] = "大王";      
		card[53] = "小王"; 	
		shuff();
	}
	public void display(){
		for (int i = 0; i < card.length; i++) {
			System.out.print(card[i]+" ");
		}
	}
}
