package day4;

public class prob401 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int dice = (int)(Math.random()*10)+1;
		System.out.println("数：" + dice);
		//for文で記述
//		for(int i=0; i<dice; i++) {
//			System.out.print("◆ ");
//		}
		//while文で記述
//		int i =0;
//		while(i < dice) {
//			System.out.print("◇");
//			i++;
//		}
		//do～while構文で記述
		int i =0;
		do {
			System.out.print("◇");
			i++;
		}while(i < dice);
		
	}

}