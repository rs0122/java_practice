package day5;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = new int[7];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10) + 1;
			System.out.print("a[" + i + "]" + "=" + a[i]);
		}
	}

}
