package factory;

public class Singletone2 {
	 
    /**
     * @param args
     */
    public static void main(String[] args) {
          System.out.println("Start.");
          Singletone obj1 = Singletone.getInstance();
          Singletone obj2 = Singletone.getInstance();
          if(obj1  == obj2){
                 System.out.println("obj1과 obj2는 같은 인스턴스 입니다");
          }
          else{
                 System.out.println("obj1과 obj2는 다른 인스턴스입니다.");
          }
   
          System.out.println("End");
    }

}