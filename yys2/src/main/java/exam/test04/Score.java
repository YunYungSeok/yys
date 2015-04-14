package exam.test04;

public class Score {
	String name;
	float kor;
	float eng;
	float math;
	
	public Score(){}
	public Score(String name,float kor,float eng,float math){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	public float average(){
		return sum()/(float)3;
	}
	
	public float sum() {
		return kor+eng+math;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public float getKor(){
		return kor;
	}
	public void setKor(float kor){
		this.kor=kor;
	}
	public float getEng() {
		return eng;
	}
	public void setEng(float eng) {
		this.eng = eng;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return name +","+kor+"," +eng+","+  math;
	}
	//객체가 갖고있는 정보나 값을 문자열로 보내주는 역할을한다.
	//toString을 하지않았을경우  Class이름이 나온다.
}
