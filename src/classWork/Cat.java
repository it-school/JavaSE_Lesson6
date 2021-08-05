package classWork;

import java.time.LocalDateTime;
import java.util.Objects;

public class Cat {
   private String name;
   private LocalDateTime birthday;

   public Cat(String name, LocalDateTime birthday) {
      this.name = name;
      this.birthday = birthday;
   }

   public Cat(String name, int day, int month, int year) {
      this.birthday = LocalDateTime.of(year, month, day, 0, 0, 0);
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public LocalDateTime getBirthday() {
      return birthday;
   }

   public void setBirthday(LocalDateTime birthday) {
      this.birthday = birthday.toLocalDate().isAfter(LocalDateTime.now().toLocalDate()) ? LocalDateTime.now() : birthday;
   }

   @Override
   public String toString() {
      return "Cat{" + "name='" + name + '\'' + ", birthday=" + birthday.toLocalDate().getDayOfMonth() + "." +
              birthday.toLocalDate().getMonth() + "." + birthday.toLocalDate().getYear() + '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Cat cat = (Cat) o;
      return Objects.equals(getName(), cat.getName()) && Objects.equals(getBirthday(), cat.getBirthday());
   }

   @Override
   public int hashCode() {
      return Objects.hash(getName(), getBirthday());
   }
}