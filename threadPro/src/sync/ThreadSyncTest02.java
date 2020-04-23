package sync;

public class ThreadSyncTest02 {
	public static void main(String[] args) {
		//1. 공유객체 만들기
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-222-3333",5000,"현빈");
		obj.acc2 = new Account("333-555-7777",1000,"김서연");
		
		//2. 쓰레드 생성
		//AccountSum sum = new AccountSum(obj);
		//AccountSend send = new AccountSend(obj);
		
		SumPrintThread t1 = new SumPrintThread(obj);
		Thread t2 = new Thread(new TransferThread(obj));
		
		//3. 생성한 쓰레드 start시키기
		//sum.start();
		//send.start();
		
		t1.start();
		t2.start();
	}

}

/*class AccountSum extends Thread{
	SharedObj obj;
	public AccountSum(SharedObj obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (obj) {
				System.out.println(obj.acc1.getBalance()+obj.acc2.getBalance());
			}
			
		}
	}
}

class AccountSend extends Thread{
	SharedObj obj;
	public AccountSend(SharedObj obj) {
		super();
		this.obj = obj;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			synchronized (obj) {
				obj.acc1.withdraw(100);
				obj.acc2.deposit(100);
				System.out.println(obj.acc1.getBalance()+"-------"+obj.acc2.getBalance());
			}
		}
	}
}*/

