package 예외처리예제;

public class ExceptionEx05 {

	static String str;
	
	public static void main(String[] args) {
		
		if(str != null) { //null이 아닌 경우
			String newStr = str.toUpperCase();
			System.out.println(newStr);
		}else { //null인경우
			System.out.println("String is null");
		}

	}

}
