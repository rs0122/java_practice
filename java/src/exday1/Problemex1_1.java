package exday1;

public class Problemex1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = (int)(Math.random() * 10) + 1;
		int b = (int)(Math.random() * 10) + 1;
		int result = add(a,b);
		int result2 = sub(a,b);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a + " + " + b + " = " + result);
		System.out.println(a + " - " + b + " = " + result2);
	}
	static int add(int a,int b) {
		return a + b;
	}
	static int sub(int a,int b) {
		return a - b;
	}
}
