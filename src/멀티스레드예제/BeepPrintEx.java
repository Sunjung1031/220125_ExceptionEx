package ��Ƽ�����忹��;

public class BeepPrintEx {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //�۾� ������ ��ü ����

		thread.start(); //�� �������� �۾������� �۵� 
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
