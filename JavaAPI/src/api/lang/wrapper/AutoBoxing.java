package api.lang.wrapper;

public class AutoBoxing {

	public static void main(String[] args) {

		//Autoboxing -> 자동 형변환

		int a = 100;
		Integer val = a; 
		a = val;
		
		Object[] arr = {1,2,3 };
		
		int v1 = Integer.parseInt("3");
		String s = val.toString();
		System.out.println(s);
		int v2 = Integer.parseInt("34");
		double v3 = Double.parseDouble("3.14");
		long v4 = Long.parseLong("2342354564345");

		System.out.println(v4 + v3 + v2 + v1);
	}

}
