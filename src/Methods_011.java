// Перегрузка методов.

import java.util.Arrays;

class Methods_011 {
   static void Operation()                                         // 1-я перегрузка.
   {
      Operation("val", 10, 12.2);
   }

   static void Operation(String value1)                            // 2-я перегрузка.
   {
      Operation(value1, 10, 12.2);
   }

   static void Operation(String value1, int value2)                // 3-я перегрузка.
   {
      Operation(value1, value2, 12.2);
   }

   static void Operation(String value1, int value2, double value3) // 4-я перегрузка.
   {
      System.out.println(value1 + "," + value2 + "," + value3);
   }

   /*
      static void Operation(String []value1) // 5-я перегрузка.
      {
          System.out.println(Arrays.toString(value1));
      }
   */
   static void Operation(String... values) // 5-я перегрузка.
   {
      switch (values.length) {
         case 1 -> System.out.println(values[0]);
         case 2 -> System.out.println("2 params: " + values[0] + "," + values[1]);
         default -> {
            for (int i = 0; i < values.length; i++) {
               System.out.println(values[i]);
            }
         }
      }
   }

   static void Operation(String value1, String value2) // 4-я перегрузка.
   {
      System.out.println(value1 + "," + value2);
   }


   public static void main(String[] args) {
      Operation();                  // 1-я перегрузка.
      Operation("val");      // 2-я перегрузка.
      Operation("val", 10);         // 3-я перегрузка.
      Operation("val", 10, 12.2);   // 4-я перегрузка.
      Operation("sgs", "SGAD", "sgsdh", "dghsrfyjh", "sfjhdsyj", "sfjsdyj", "dhsrhj");

      Operation("param1", "param2");

      System.out.println(Arrays.toString(args));
   }
}
