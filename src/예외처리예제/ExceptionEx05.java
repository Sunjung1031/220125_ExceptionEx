package ����ó������;

public class ExceptionEx05 {

	static String str;
	
	public static void main(String[] args) {
		
		if(str != null) { //null�� �ƴ� ���
			String newStr = str.toUpperCase();
			System.out.println(newStr);
		}else { //null�ΰ��
			System.out.println("String is null");
		}

	}

}
