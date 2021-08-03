package classWork;

public class Person {
   public String address;
   private String name;
   private int age;

   public Person(String name, int age, String address) {
      this.setName(name);
      this.setAge(age);
      this.address = address;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      name = name.strip();
      this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age > 0 && age <= 150 ? age : -1;
   }

   public String toString() {
      return "\nPerson: " + this.name + "\nage: " + this.age + "\naddress: " + this.address;
   }
}
