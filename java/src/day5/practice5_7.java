package day5;

public class practice5_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] a = new int[5];
		int sum = 0,avg = 0;
		for(int i =0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10) + 1;
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		avg = sum/5;
		System.out.println("合計値：" + sum);
		System.out.println("平均値：" + avg);
		System.out.println();
		System.out.print("平均値より大きい値");
		for(int i =0; i < a.length; i++) {
			if(a[i] > avg) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.print("平均値より小さい値");
		for(int i =0; i < a.length; i++) {
			if(a[i] < avg) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
