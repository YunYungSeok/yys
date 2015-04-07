package factory;

interface CarFactory {
	public Car makeCar();
}
 
interface Car {
	public String getType();
}
 
class SedanFactory implements CarFactory {
	public Car makeCar() { return new Sedan(); }
}
 
class Sedan implements Car {
	public String getType() { return "Sedan"; }
}
 
public class factoryEx {
	public static final void main(String[] args) {
		SedanFactory sedanFactory = new SedanFactory();
		Car car = sedanFactory.makeCar();
		//���丮���� �ν��Ͻ��� ������ش� 
		//SedanFactory���� return new Sedan();�� ���ֱ⶧����
		//Car car=new Sedan(); �̵ǰ� car.getype�� ���ؼ� sedan�� ���Ϲ޴´�
		System.out.println("Type: " + car.getType());
		
	}
}