package sync;

public class SumPrintThread extends Thread{
	SharedObj obj;

	public SumPrintThread(SharedObj obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		for (int i = 1; i <= 10; i++) {
			synchronized (obj) {//�ڵ� ������ lock�� �����ϰڴٴ� �ǹ�
				long total = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("�� ������ �ܾ� ===>"+total);
			}
		}
	}
}