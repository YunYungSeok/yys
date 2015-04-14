package exam.test03;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("exam/test03/beans.xml");
		System.out.println("[컨테이너에 보관된 객체의 이름을 출력]");
		for(String name:ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
		/*익명 빈 출력 / 뒤에 인덱스값*/
		
		System.out.println("[익명 빈 꺼내기]");
		Score score1=(Score)ctx.getBean("exam.test03.Score");
		Score score2=(Score)ctx.getBean("exam.test03.Score#0");
		if(score1 == score2) System.out.println("score == score#0");
		
		Score score3=(Score)ctx.getBean("exam.test03.Score#1");
		if(score1 != score3) System.out.println("score !== score#1");
		
		/*exam.test03.Score는 exam.test03.Score#0 의별명이기 때문에 같은 객체라는 것을 확인할수있다*/
		
		
		System.out.println("[클래스 타입으로 빈 꺼내기]");
		Score score4=(Score)ctx.getBean(exam.test03.Score.class);
		//2개의 인스턴스가 있다고 오류가 출력됨
		
	}
}
