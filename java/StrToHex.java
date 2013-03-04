// 文字列データから文字コードを出力する場合
// 引数
// args0 : StrToHex
// args1 : あいうえお
// args2 : Windows-31J

// 文字コードから文字列データを出力する場合
// Windows-31J にのみ対応で、文字コード部分のハードコーティングしている
// 引数
// args0 : HexToStr

public class StrToHex {
	public static void main(String[] args) {

		// 引数の数をチェックする
		if (args.length = 0) {
			System.out.println("引数の数が正しくありません。");
			System.exit(1);
		}

		// 文字列データから文字コードを取得する
		if ("StrToHex".equals(args[0])) {
			byte[] b = null;
			StringBuffer sb = new StringBuffer();
			try {
				b = args[1].getBytes(args[2]);
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (byte bb : b) {
				sb.append(String.format("%02x", Byte.valueOf(bb)));
			}
			System.out.println(sb.toString());

			// 文字コードから文字列データを取得する
		} else if ("HexToStr".equals(args[0])) {
			byte[] bytes = { (byte) 0x82, (byte) 0xA0, (byte) 0x82, (byte) 0xA2 };
			String str = null;
			try {
				str = new String(bytes, "Windows-31j");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(str);

			// 第一引数が正しくない場合
		} else {
			System.out
					.println("第一引数が正しくありません。[StrToHex] あるいは [HexToStr] のどちらかを入力してください。");
		}
	}
}