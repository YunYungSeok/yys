package Observer;

class innertest{
	public void callt(){
		System.out.println("callt의 메소드");
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
				System.out.println("익명함수를 이용하였다");
			}
		};
		innerCallt.callt();
	}
}