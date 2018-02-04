package seCard;

import java.util.Arrays;
import java.util.Random;

public class CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		Pcard pcard = new Pcard();
		pcard.init();
		pcard.display();
		Cardplayer p1 = new Cardplayer(pcard);
		Cardplayer p2 = new Cardplayer(pcard);
		Cardplayer p3 = new Cardplayer(pcard);
		Cardplayer plast = new Cardplayer(pcard);
		
		p1.getcard1();
		p2.getcard2();
		p3.getcard3();
		plast.getLast();
		System.out.println();
		
		System.out.println("玩家1："+Arrays.toString(p1.sCard));
		System.out.println("玩家2："+Arrays.toString(p2.sCard));
		System.out.println("玩家3："+Arrays.toString(p3.sCard));
		System.out.println("底牌：   "+Arrays.toString(plast.last));
		
	}

	
}
