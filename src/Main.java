public class Main {
   public static long getFactrorial(int n) {
      long f = 1;
      for (int i = 1; i <= n; i++) {
         f *= i;
      }
      return f;
   }

   public static long getFactorialRecursive(int n) {
      return n <= 1 ? 1 : n * getFactorialRecursive(n - 1);
   }

   public static void main(String[] args) {
      HomeWork homeWork = new HomeWork();

      int month = 1;
      System.out.println(HomeWork.creditCalculate(300));
      System.out.println(HomeWork.creditCalculate(300));
      System.out.println(HomeWork.creditCalculate(300));
      System.out.println(HomeWork.creditCalculate(300));

      
      //System.out.println(getFactrorial(5));
      /*
      long f = getFactorialRecursive(5);
      System.out.println(f);

      Person person = new Person(" aNONYMOUS", 20, "Odessa");
      System.out.println(person);

      Cat cat1 = new Cat("QWERTYU", 11, 5, 2020);
      System.out.println(cat1);
*/

/*
      Student student1 = new Student();
      student1.setName("John");
      student1.setAge((byte) 17);
      student1.setUniversity("OSPU");

      Student student2 = new Student("John", (byte) -15, "ONPU");

      if (student1.equals(student2))
         System.out.println("Students are equal");

     System.out.println(student.getName());
      System.out.println(student.getAge());
      System.out.println(student.getUniversity());
     student.printStudent();
      System.out.println(student.getStudent());
      System.out.println(student1);
      System.out.println(student2);

      */

      // Создать класс Книга содержащий поля: название, авторы, год издания, кол-во страниц, издательство
      // Реализовать методы: constructor (with parameters), setters(), getters(), equals(), toString()
      // Реализовать проверки корректности для числовых значений
   }
}
