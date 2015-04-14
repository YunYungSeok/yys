package exam.test02;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("exam/test02/beans.xml");
		/*ClassPathXmlApplicationContext의 인스턴스를 생성할때 생성자에 빈 설정 파일의 경로를 넘긴다
		 * ClassPathXmlApplicationContext는 자바 클래스 경로에서 exam/test01 폴더를 찾는다
		 * 그리고 beans.xml파일을 로딩한다.빈 설정 파일에 선언된 빈을 생성하여 객체 풀에 보관한다. Score 객체를 한개생성
		 */
		System.out.println("[컨테이너에 보관된 객체의 이름을 출력]");
		for(String name:ctx.getBeanDefinitionNames()){
			System.out.println(name);
		}
		/*getBeanDefinitionNames은 빈 컨테이너에 보관된 빈의 이름들을 알고 싶을때 사용한다.
		 * 메서드 반환타입은 String 배열(String[])이다. score3,score4가 보이지 않는이유는 score2의 별명이기 때문이다.
		 * 
		 * */

		System.out.println("[score2의 별명 출력]");
		for(String alias : ctx.getAliases("score2")){
			System.out.println(alias);
		}
		/*빈의 별명을 알고싶으면 getAliases 를호출한다.
		 * 꺼낼때는 id와 마찬가지로 getBean()의 매개변수로 name속성값을 넘긴다.
		 * */
		
		//name="score"
		Score score=(Score)ctx.getBean("score");
		//name="score2,score3,score4"
		Score score2=(Score)ctx.getBean("score2");
		Score score3=(Score)ctx.getBean("score3");
		Score score4=(Score)ctx.getBean("score4");
		
		//name="score-ok"
		Score scoreOk=(Score)ctx.getBean("score-ok!");
		System.out.println("[빈꺼내기]");
		if(score!=null) System.out.println("score 찾았음.");
		if(score2!=null) System.out.println("score2 찾았음.");
		if(score3!=null) System.out.println("score3 찾았음.");
		if(score4!=null) System.out.println("score4 찾았음.");
		if(scoreOk!=null) System.out.println("score-ok! 찾았음.");
		/*getBean()은 아이디(id),이름(name),별명(name)으로 빈을 찾아준다
		 * score-ok!를 찾은걸 보니 특수문자도 가능하다.
		 */
		
		System.out.println("[생성된 빈 비교]");
		if(score == score2) System.out.println("score == socre2");
		if(score2 == score3) System.out.println("score2 == socre3");
		if(score3 == score4) System.out.println("score3 == socre4");
		if(score4 == scoreOk) System.out.println("score4 == socreOk");
		/*score2와 score3,score4가 같은객체임을 알수있다. score3,score4는 score2의 별명이기때문이다*/ 
	}
}
