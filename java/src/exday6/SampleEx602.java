package exday6;

import java.util.HashSet;

public class SampleEx602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashSet<String> hs = new HashSet<String>();
		// ハッシュセットにデータを追加
		hs.add("山田太郎");
		hs.add("山田太郎");
		hs.add("山田太郎");
		hs.add("ぽもた");
		hs.add("ろおき");
		hs.add("ろおき");
		for(String s:hs) {
			System.out.println(s);
		}
	}

}
