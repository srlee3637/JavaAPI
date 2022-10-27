package api.lang.sb;

public class StringTest {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		
		
		String str = "";
		for(int i = 1; i < 300000; i++) {
			str += "A";
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end - start) * 0.001 + "초");
		
		StringBuilder sb = new StringBuilder("A");
		
		
		start = System.currentTimeMillis();
		for(int i = 1; i < 300000; i++) {
			sb.append("A");
		}
		
		end = System.currentTimeMillis();
		System.out.println((end - start) * 0.001 + "초");
		
	}

}
