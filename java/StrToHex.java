// ������f�[�^���當���R�[�h���o�͂���ꍇ
// ����
// args0 : StrToHex
// args1 : ����������
// args2 : Windows-31J

// �����R�[�h���當����f�[�^���o�͂���ꍇ
// Windows-31J �ɂ̂ݑΉ��ŁA�����R�[�h�����̃n�[�h�R�[�e�B���O���Ă���
// ����
// args0 : HexToStr

public class StrToHex {
	public static void main(String[] args) {

		// �����̐����`�F�b�N����
		if (args.length = 0) {
			System.out.println("�����̐�������������܂���B");
			System.exit(1);
		}

		// ������f�[�^���當���R�[�h���擾����
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

			// �����R�[�h���當����f�[�^���擾����
		} else if ("HexToStr".equals(args[0])) {
			byte[] bytes = { (byte) 0x82, (byte) 0xA0, (byte) 0x82, (byte) 0xA2 };
			String str = null;
			try {
				str = new String(bytes, "Windows-31j");
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(str);

			// ���������������Ȃ��ꍇ
		} else {
			System.out
					.println("������������������܂���B[StrToHex] ���邢�� [HexToStr] �̂ǂ��炩����͂��Ă��������B");
		}
	}
}