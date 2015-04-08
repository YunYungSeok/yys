package Observer;

public class Publisher{
	Listener o;
	public void addEventListener(Listener o) {
		this.o = o;
	}
	public void add() {
		o.call("추가");
	}
	public void remove() {
		o.call("삭제 ");
	}
	public void test(){
		o.callt("테스트용임");
	}
	public void innert(){
		o.ct("이너테스트");
	}
	
	public static void main(String[] args) {
		Listener o = new Subscriber();
		Publisher um = new Publisher();
		um.addEventListener(o);
		um.add();
		um.remove();
		um.test();
		um.innert();
	}
}