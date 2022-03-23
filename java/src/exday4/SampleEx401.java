package exday4;

public class SampleEx401 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//携帯番号クラスのインスタンス生成
		CellPhone cp = new CellPhone("hoge@email.com", "090-1234-5678");
		//携帯電話クラスで、電話とメールを送る
		cp.call("011-123-4567");
		cp.sendMail("fuga@email.com");
		//電話インターフェースでインスタンスにアクセス
		IPhone phone = (IPhone)cp;
		phone.call("011-987-6543");
		//メールインターフェースでインスタンスにアクセス
		IEmail mail =(IEmail)cp;
		mail.sendMail("bar@email.com");
	}

}
