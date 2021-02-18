import java.util.Objects;

public class Student {
   private String name;
   private byte age;
   private String university;

   public Student(String name, byte age, String university) {
      this.name = name;
      this.setAge(age);
      this.university = university;
   }

   public Student() {
   }

   public byte getAge() {
      return age;
   }

   public void setAge(byte age) {
      if (age > 0 && age < 150)
         this.age = age;
      else
         this.age = -1;
   }

   public String getUniversity() {
      return university;
   }

   public void setUniversity(String university) {
      this.university = university;
   }

/*   public String getStudent() {
      return this.getName() + System.lineSeparator() + this.getAge() + System.lineSeparator() + this.getUniversity();
   }

   public void printStudent() {
      System.out.println(this.getName());
      System.out.println(this.getAge());
      System.out.println(this.getUniversity());
   }*/

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return this.getName() + System.lineSeparator() + (this.getAge() > 0 ? this.getAge() : "incorrect age") + System.lineSeparator() + this.getUniversity();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Student student = (Student) o;
      return age == student.age && Objects.equals(name, student.name) && Objects.equals(university, student.university);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age, university);
   }
}