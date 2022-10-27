package api.lang.object;

public class Person/* extends Object */ implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	//오버라이딩 - toString
	//generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	//멤버변수명이 같으면 true반환
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Person) {
			Person p = (Person)obj;
			String n = p.getName();
			
			if(n.equals(this.name)) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		
		return false;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

	
	
	

}
