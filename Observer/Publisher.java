package Observer;

public class Publisher{
	Listener o;
	public void addEventListener(Listener o) {
		this.o = o;
	}
	public void add() {
		o.call("�߰�");
	}
	public void remove() {
		o.call("���� ");
	}
	public void test(){
		o.callt("�׽�Ʈ����");
	}
	public void innert(){
		o.ct("�̳��׽�Ʈ");
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