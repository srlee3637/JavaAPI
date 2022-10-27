package api.lang.object;

public class MainClass {

	public static void main(String[] args) {

		Person p = new Person("홍길동");
		
		//String result = p.toString();
		//toString()
		System.out.println(p.toString()); //반환 ok
		
		//equals()
		Person p2 = new Person("홍길동");
		
		System.out.println(p.equals(p2)); //객체 주소 다름 
		
		//clone() 객체 복사
		try {
			Object obj = p.clone();
			Person p3 = (Person) obj;
			
			System.out.println("복사된 객체의 name: " + p3.getName());
			System.out.println(p3 = p);
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
