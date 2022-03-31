package exday7;

public class SmapleEx703 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			for(int i = 0; i<= 5; i++) {
				int a = getNum(i);
				int b = 5;
				System.out.print(a + " / " + b + " = ");
				System.out.println(calc(a,b));
			}
		}catch(ArithmeticException e){
			System.out.println();
			System.out.println("0による割り算発生");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外にアクセスしました。");
		}finally {
			System.out.println("終了");
		}
	}
	
	public static int calc(int a,int b) throws ArithmeticException{
		return a / b;
	}
	
	public static int getNum(int index) throws ArrayIndexOutOfBoundsException{
		int[] num = {1, 2, 3, 4};
		return num[index];
	}

}
