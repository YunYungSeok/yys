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
                 System.out.println("obj1�� obj2�� ���� �ν��Ͻ� �Դϴ�");
          }
          else{
                 System.out.println("obj1�� obj2�� �ٸ� �ν��Ͻ��Դϴ�.");
          }
   
          System.out.println("End");
    }

}