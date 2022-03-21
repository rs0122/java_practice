package exday1;

public class SampleEx102 {
	public SampleEx102() {
		System.out.println("コンストラクタ");
	}
	public void foo() {
		System.out.println("インスタンスメソッド");
	}
	public static void bar() {
		System.out.println("静的メソッド");
	}
	public static void main(String[] args) {
		SampleEx102 i = new SampleEx102();
		i.foo(); //インスタンスの呼び出し
//		i.bar(); //インスタンスからも静的メソッドを呼べる（非推奨の為、警告が出る）
		SampleEx102.bar(); //クラス名からの呼び出し
		bar(); //同じクラス名なら、クラス名省略可
		//ガーベージコレクタの呼び出し
		System.gc();
	}
}
