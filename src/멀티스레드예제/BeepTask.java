package ��Ƽ�����忹��;

import java.awt.Toolkit;

/*
 * BeepTaskŬ������Runnable �������̽��� ������Ų Ŭ�����̱� ������ 
 * ������ ����� ���� Ŭ�����̴�. 
 * �׷��Ƿ� "�۾� ������" ������ Ŭ������ �� ���̴�.
 */


public class BeepTask implements Runnable {

	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // beep()�������� �߻���Ű�� �޼ҵ�
			try {
				Thread.sleep(1000); // 1�ʰ� cpu�۵��� ���ߴ� �� �� 1�� �������� �������� �����
			} catch (Exception e) {
				System.out.println(e);

			}
		}
	}

}
