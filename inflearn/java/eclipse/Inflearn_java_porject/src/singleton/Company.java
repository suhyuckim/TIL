package singleton;

public class Company {
	
	//그래서 여기서 생성, 단 하나만 생성
	private static Company instance = new Company(); 
	
	private Company() { }//외부에서 호출하지 못하게 하기 위한 행위
		
	//외부에서 가져오기 못하기 때문에 여기서 만들어줌
	//외부에서 가져다 쓸수있음
	//객체를 생성하지 않고 가져다 쓰려면 static 메소드 이용
	public static Company getInstance() {
		if(instance == null) { //방어적인 코딩
			instance = new Company();
		}
		return instance;
	}
}