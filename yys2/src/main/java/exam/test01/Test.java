package exam.test01;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("exam/test01/beans.xml");
		/*ClassPathXmlApplicationContext의 인스턴스를 생성할때 생성자에 빈 설정 파일의 경로를 넘긴다
		 * ClassPathXmlApplicationContext는 자바 클래스 경로에서 exam/test01 폴더를 찾는다
		 * 그리고 beans.xml파일을 로딩한다.빈 설정 파일에 선언된 빈을 생성하여 객체 풀에 보관한다. Score 객체를 한개생성
		 */
		Score score=(Score)ctx.getBean("score");
		 /*(Score)ctx.getBean("score"); <-bean아이디
		  * getBean의 반환타입은 Object이기때문에 반환된 객체를 제대로 사용하려면 실제 타입으로 형변환해야합니다.
		  * */
		
		System.out.println("합계:"+score.sum());
		System.out.println("평균:"+score.average());
	}
}
