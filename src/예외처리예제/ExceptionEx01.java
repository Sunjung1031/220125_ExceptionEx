package 예외처리예제;

public class ExceptionEx01 {
	
	public static void ExceptionExample() throws Exception{
		int number = 50/0;
	}

	public static void main(String[] args) {
	  try {
		ExceptionExample();
	}catch (Exception e) {
		System.out.println("ERROR발생" + e);
	}
	
	}

}
