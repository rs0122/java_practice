package day6;

public class Problem6_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Minmax m = new Minmax();
		int a = 4,b = 2, c = 1;
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + m.max(a,b,c));
		System.out.println(a + "と" + b + "と" + c +  "のうち、最小のものは" + m.min(a,b,c));
	}
}