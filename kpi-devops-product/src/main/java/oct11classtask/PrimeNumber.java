package oct11classtask;

public class PrimeNumber {
	public static boolean checkPrime(int num) {
		boolean flag = false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
			}
		}
		if (flag == true)
			return false;
		return true;
	}

	public static void main(String args[]) {
		boolean f1 = checkPrime(3);
		System.out.println(f1 + " Number " + 3 + " is Prime Number");
		boolean f2 = checkPrime(4);
		System.out.println(f2 + " Number " + 4 + " is Not Prime Number");
		boolean f3 = checkPrime(5);
		System.out.println(f3 + " Number " + 5 + " is Prime Number");

	}
}
