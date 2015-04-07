package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloHandler implements InvocationHandler {
    private Object targetObj = null;
   
    /*public static Object newInstance(Object obj) {
		//Proxy
		// Foo --> Bar proxy = (Bar) TraceProxy.newInstance(new BarImpl());
		
		return java.lang.reflect.Proxy.newProxyInstance
			   (
					obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
					new TraceProxy(obj)
			   );
	}*/

    public HelloHandler(Object target) {
          this.targetObj = target;
    }
   
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
     try {
     System.out.println(" <<<<<<<<<< Start...");
     System.out.println(method.getName());
     System.out.println(args);
    
     return method.invoke(targetObj, args);
     }
     catch(Exception e) {
     throw e;
     }
     finally {
     System.out.println(" <<<<<<<<<< END...");
     }
    }

}