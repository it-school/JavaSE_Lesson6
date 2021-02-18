public class Main {
   public static void main(String[] args) {
      Student student1 = new Student();
      student1.setName("John");
      student1.setAge((byte) 17);
      student1.setUniversity("OSPU");

      Student student2 = new Student("John", (byte) -15, "ONPU");

      if (student1.equals(student2))
         System.out.println("Students are equal");

/*      System.out.println(student.getName());
      System.out.println(student.getAge());
      System.out.println(student.getUniversity());*/
/*      student.printStudent();
      System.out.println(student.getStudent());*/
      System.out.println(student1);
      System.out.println(student2);


      // Создать класс Книга содержащий поля: название, авторы, год издания, кол-во страниц, издательство
      // Реализовать методы: constructor (with parameters), setters(), getters(), equals(), toString()
      // Реализовать проверки корректности для числовых значений














   }
}
