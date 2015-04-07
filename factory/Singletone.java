package factory;

public class Singletone {
    //Ŭ���������� ���� �� �ϳ��� ����� �˴ϴ�.
    private static Singletone singleton = new Singletone();
   
    //�Ʒ��Ͱ��� �����ڰ� private�� �ξ ���ο��� ������ �� ���� �մϴ�.
    private Singletone(){
          System.out.println("�ν��Ͻ��� �����߽��ϴ�.");
    }
   
    //Ŭ���� �޼ҵ�� �� �ϳ� ���� Ŭ���������� ��ȯ�ϰ� �մϴ�.
    public static Singletone getInstance(){
          return singleton;
    }
   
}