package seCard;

public class Cardplayer {

	Pcard pcard ;
	String[] sCard = new String[17];
	String[] last = new String[3];
	public Cardplayer(Pcard pcard){
		this.pcard = pcard;
	}
	public void getcard1(){
		int j = 0;
		for(int i = 0;i<17;i++){
			sCard[j] = pcard.card[i];
//			System.out.println(sCard[j]);
			j++;
		}
	}
	public void getcard2(){
		int j = 0;
		for(int i = 17;i<34;i++){
			sCard[j] = pcard.card[i];
			j++;
		}
	}
	public void getcard3(){
		int j = 0;
		for(int i = 34;i<51;i++){
			sCard[j] = pcard.card[i];
			j++;
		}
	}
	public void getLast(){
		int j = 0;
		for(int i =51;i<54;i++){
			last[j] = pcard.card[i];
			j++;
		}
	}
}
