// Методы (Функции).

class Methods_005 {
   /**
    * Sum of two integers
    *
    * @param summand1 first summand
    * @param summand2 second summand
    *
    * @return summ of summand1 and summand2
    */
   private static int Add(int summand1, int summand2) {
      summand1 = 5;
      return summand1 + summand2;
   }

   private static float Add(float summand1, float summand2) {
      return summand1 + summand2;
   }

   public static void main(String[] args) {
      int summand1 = 2, summand4 = 3;

      int sum = Add(summand1, summand4);

      System.out.println(sum); // 5
      System.out.println(summand1);

      float smnd1 = 7.6f, smnd2 = 5.9f;
      System.out.println(Add(smnd1, smnd2));
   }
}
