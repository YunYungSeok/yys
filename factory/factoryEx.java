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
		//팩토리에서 인스턴스를 만들어준다 
		//SedanFactory에서 return new Sedan();를 해주기때문에
		//Car car=new Sedan(); 이되고 car.getype을 통해서 sedan을 리턴받는다
		System.out.println("Type: " + car.getType());
		
	}
}