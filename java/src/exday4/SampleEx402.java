package exday4;

public class SampleEx402 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Tank t = new Tank();
		System.out.println(t.getName()+"の武器の名前"+Tank.WEAPON_NAME);
		System.out.println(t.getName()+"の武器のタイプ"+Tank.TYPE_NAME);
		System.out.println();
		t.attack();	//攻撃
	}

}
