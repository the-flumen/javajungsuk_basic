
public class Ex2_2 {

	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("====변환 전====");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("\n");
		
		tmp = x;
		x = y;
		y = tmp;

		System.out.println("====변환 후====");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
