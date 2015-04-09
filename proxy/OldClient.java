package proxy;

public class OldClient {
    public static void main(String[] args) {
     HelloWorld hello = new HelloWorldImpl();
     System.out.println(hello.sayHello("JCLEE"));
    }
}