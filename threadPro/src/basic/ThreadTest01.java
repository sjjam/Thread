package basic;
/*
 * ��Ƽ������ ���α׷���
 * 1. Thread Ŭ������ ���
 * 2. run�޼ҵ带 �������̵�
 * 	  => ������ ���α׷������� �۾��ϰ� ���� ������ ����(������ ���� �帧���� ǥ���ϰ� ���� ������ ����)
 * 3. ThreadŬ������(Thread�� ����Ŭ����) start�޼ҵ带 ȣ��
 *    => �����۾� ����
 *    => run�� ���� ȣ������ �ʰ� start�޼ҵ带 ȣ���ϸ� JVM�� ������ �� �ִ� ���°� �Ǹ� �ڵ����� Thread Ŭ������ run�޼ҵ带 ȣ��
*/
class ThreadDemo1 extends Thread{
	public ThreadDemo1(String name) {
		super(name);
	}
	public void run() {
		//1���� 20���� ����ϴ� �ڵ�
		for (int i = 1; i <= 20; i++) {
			System.out.print(i+"("+getName()+")");
			try {
				Thread.sleep(500); //�����帧�� �����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}
}
//ThreadDemo001 ��ü�� Ȱ���Ͽ� ��Ƽ������ ���α׷��� ����
public class ThreadTest01 {
	public static void main(String[] args) {
		System.out.println("*******���α׷�����*******");
		ThreadDemo1 t1 = new ThreadDemo1("t1");
		ThreadDemo1 t2 = new ThreadDemo1("t2");
		//t1.run(); -> �ܼ��� �޼ҵ� ȣ��(���������α׷����� �� �� ����.)
		t1.start();
		t2.start();
		System.out.println("�۾� ��.....");
		for (int i = 1; i <= 10; i++) {
			System.out.println("main");
			try {
				Thread.sleep(200); //�����帧�� �����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("*******���α׷�����*******");
	}

}