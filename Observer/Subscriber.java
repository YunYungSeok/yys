package Observer;

class innertest{
	public void callt(){
		System.out.println("callt�� �޼ҵ�");
	}
}

public class Subscriber implements Listener{
	public void call(String msg) {
		System.out.println("received="+msg);
	}
	public void callt(String msgt) {
		System.out.println("test="+msgt);
	}
	public void ct(String ct){
		innertest innerCallt=new innertest(){
			public void callt(){
				System.out.println("�͸��Լ��� �̿��Ͽ���");
			}
		};
		innerCallt.callt();
	}
}