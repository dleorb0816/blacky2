package EX10;

public class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};

	
	public static String Kor2Eng(String word) {
		for (int i=0; i<kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
		
	}
	
}
