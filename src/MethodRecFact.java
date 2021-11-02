
class MethodRecFact {
    private static double Factorial(long n)
    {
       /* if (n == 0)
            return 1;
        else
            return n * Factorial(n - 1);
        */
		 return n == 0 ? 1 : n * Factorial(n - 1);
		 /*
		 5! = 5 * 4!
		 4! = 4 * 3!
		 3! = 3 * 2!
		 2! = 2 * 1!
		 1! = 1 * 0!
		 0! = 1
		  */
	 }

    public static void main(String[] args)
    {
	    final int N = 22;
	    double factorial = Factorial(N);
		 // 5! = 1 * 2 * 3 * 4 * 5

	    System.out.println(factorial);

	    double n = 1;
	    for (int i = 1; i <= N; i++) {
		    n *= i; // n = n * i;
	    }

	    System.out.println(n);
    }
}
