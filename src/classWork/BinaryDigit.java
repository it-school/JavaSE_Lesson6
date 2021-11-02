package classWork;

class BinaryDigit {
   public static String result = "";

   private static void Converter(int n) {
      int temp;

      temp = n % 2;

      if (n >= 2)
         Converter(n / 2);

      result += temp;
      System.out.print(temp);
   }

   public static void main(String[] args) {
      int n = 16;

      Converter(n);
      System.out.println();
      System.out.println(String.format("%08d", Integer.parseInt(result)));
   }
}
