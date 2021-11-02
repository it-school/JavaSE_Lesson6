package classWork;

public class Main {
   public static long getFactorial(int n) {
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
      System.out.println(getFactorial(5));

      long f = getFactorialRecursive(5);
      System.out.println(f);


      Person person = new Person(" aNONYMOUS", 20, "Odessa");
      System.out.println(person);

      Cat cat1 = new Cat("QWERTYU", 11, 5, 2020);
      System.out.println(cat1);


      classWork.Student student1 = new classWork.Student();
      student1.setName("John");
      student1.setAge((byte) 17);
      student1.setUniversity("OSPU");

      classWork.Student student2 = new classWork.Student("John", (byte) -15, "ONPU");

      if (student1.equals(student2))
         System.out.println("Students are equal");

      System.out.println(student1.getName());
      System.out.println(student1.getAge());
      System.out.println(student1.getUniversity());

      System.out.println(student1);
      System.out.println(student2);


      // Создать класс Книга содержащий поля: название, авторы, год издания, кол-во страниц, издательство
      // Реализовать методы: constructor (with parameters), setters(), getters(), equals(), toString()
      // Реализовать проверки корректности для числовых значений
   }
}
