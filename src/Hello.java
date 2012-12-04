public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int size = args.length;
		if (size >= 0) {
			for (int i = 0; i < size; i++) {
				System.out.println("Hello " + args[i] + "!!!");
			}
		} else {
			System.out.println("Hello Nobody");
		}
	}
}
