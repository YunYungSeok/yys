package factory;

public class Singletone {
    //클래스변수를 만들어서 딱 하나만 만들게 됩니다.
    private static Singletone singleton = new Singletone();
   
    //아래와같이 생성자가 private로 두어서 메인에서 생성할 수 없게 합니다.
    private Singletone(){
          System.out.println("인스턴스를 생성했습니다.");
    }
   
    //클래스 메소드로 딱 하나 만든 클래스변수를 반환하게 합니다.
    public static Singletone getInstance(){
          return singleton;
    }
   
}