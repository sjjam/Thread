package basic;
class DigitThread extends Thread{
	public DigitThread(String name) {
		super(name);
	}
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
class AlphaThread extends Thread{
	public AlphaThread(String name) {
		super(name);
	}
	public void run() {
		char alpha = 65;
		while(true) {
			String str = String.valueOf(alpha);
			System.out.print
			(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			alpha++;
			if(alpha > 90) {
				break;
			}
		}
	}
}
public class ThreadExam01 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		DigitThread d = new DigitThread("Digit");
		AlphaThread a = new AlphaThread("Alpha");
		d.start();
		a.start();
		System.out.println("main 종료");
	}

}
