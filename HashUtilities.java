public class HashUtilities {

	public static int shortHash(int x) {
		double temp = x * 0.1;
		temp = Math.abs(temp % 1000);
		int result = (int) temp;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(shortHash(1987536458));
	}
}



