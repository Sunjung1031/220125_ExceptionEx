package 멀티스레드예제;

import java.awt.Toolkit;

/*
 * BeepTask클래스는Runnable 인터페이스를 구현시킨 클래스이기 때문에 
 * 스레드 기능을 가진 클래스이다. 
 * 그러므로 "작업 스레드" 역할의 클래스가 된 것이다.
 */


public class BeepTask implements Runnable {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // beep()비프음을 발생시키는 메소드
			try {
				Thread.sleep(1000); // 1초간 cpu작동을 멈추는 것 즉 1초 간격으로 비프음을 울려라
			} catch (Exception e) {
				System.out.println(e);

			}
		}
	}

}
