package itschool;

public class Main {
   static int factorial(int n) {
      int result = 1;
      for (int i = 2; i <= n; i++) {
         result *= i;
      }

      return result;
   }

   static int factorialR(int n) {
      return (n <= 1) ? 1 : n * factorialR(n - 1);
   }

   public static void main(String[] args) {
      System.out.println(factorial(5));
      int n = factorialR(5);
      System.out.println(n);

/*      Scanner sc = new Scanner(System.in);
      HomeWork1 credit = new HomeWork1();
      credit.credit = 10000;

      System.out.println(credit.moneyCredit(500));
      System.out.println(credit.moneyCredit(1500));
      System.out.println(credit.moneyCredit(5500));
      System.out.println(credit.moneyCredit(2500));
      System.out.println(credit.moneyCredit(100));

      HomeWork1 credit2 = new HomeWork1(5800);
      System.out.println(credit2.moneyCredit(500));
      System.out.println(credit2.moneyCredit(1500));
      System.out.println(credit2.moneyCredit(5500));

      HomeWork2 exchanger = new HomeWork2(28.1, 30.5, 36);
      System.out.println(exchanger.exchange(1000, CurrencyType.USD));*/

        /*
        // Создание объекта с конструктором по-умолчанию
        classWork.Student student1 = new classWork.Student();
        student1.setName("classWork.Student");
        student1.setSpecialty("OOP");
        student1.setBirthday(new Date(2000, 12, 25));

        // Вывод информации о студенте
        System.out.println(student1.getName());
        System.out.println(student1.getSpecialty());
        System.out.println(student1.getBirthday());
        System.out.println(student1.getBirthday(2));

        // Создание объекта с пользовательским конструктором (с двумя параметрами)
        classWork.Student student2 = new classWork.Student("Sidorov", "Sociology");
        System.out.println(student2.getName());
        System.out.println(student2.getSpecialty());

        // Вывод адресов объектов
        System.out.println(student1);
        System.out.println(student2);

//        student1 = student2;                    // копирование ссылки одного объекта в другой объект
//        student1.setName(student2.getName());   // После чего, изменяя имя одного объекта
//        System.out.println(student1.getName()); // получаем одинаковые имена
//        System.out.println(student2.getName()); // у обоих объектов, т.к. теперь это один и тот же объект

        // Если же не копировать ссылку, а просто копировать значения полей
        student1.setName("Developer");
        System.out.println(student1.getName()); // то объекты имеют раличное расположение в памяти
        System.out.println(student2.getName()); // и оказываются физически разными объектами
        System.out.println(student1);
        System.out.println(student2);


        classWork.Student[] group = new classWork.Student[5];  // создание массива объектов (экземпляров класса)

        String specialty = "Разработка программного обеспечения";

        group[0] = new classWork.Student("Алексей", specialty);  // инициализация элементов массива объектов
        group[1] = new classWork.Student("Иван", specialty);
        group[2] = new classWork.Student("Александр", specialty);
        group[3] = new classWork.Student("Наталия", specialty);
        group[4] = new classWork.Student("Виктор", specialty);

        int counter = 0;
        for (classWork.Student student : group)
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());

            System.out.println(student.Sleep());
            student.setName("Name od student №" + counter++);  // присвоение нового имени полю элементов массива ссылочного типа
        }                                                       // приводит к изменению данных объектов

        for (classWork.Student student : group)  // демонстрация изменений
        {
            System.out.println(student.getName() + " учится на специальности : " +
                    student.getSpecialty());
        }
        */
   }
}