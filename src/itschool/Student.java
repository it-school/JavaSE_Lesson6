package itschool;

import java.util.Date;

class Student {
    //  поля
    private String name;        // Имя студента (доступно только внутри класса)
    private String specialty;   // Специальность (доступна только внутри класса)
    private Date birthday;      // Дата рождения (доступна только внутри класса)

    // Конструктор по-умолчанию (без параметров)
    Student()
    {
        name = "NoName";
        specialty = "Software developer";
        birthday = new Date();
    }

    // Конструктор класса, определенный пользователем
    Student(String name, String speciality)
    {
        // ключевое слов this явно указывает, что поле относится к данному классу
        this.name = name;
        this.specialty = speciality;
    }

    String getSpecialty()       // Метод-аксессор (геттер) для получения Специальности (доступен в любом месте текущего пакета com.itschool)
    {
        return specialty;
    }

    // Методы для получения свойств
    public void setSpecialty(String specialty)  // Аксессор (сеттер) для присвоения значения наименования Специальности
    {
        this.specialty = specialty;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    // Метод для получения Имени (доступен в любом месте текущего пакета com.itschool)
    String getName()
    {
        return name;
    }

    // Метод для Изменения Имя (доступен в любом месте программы)
    public void setName(String var)
    {
        this.name = var;
    }

// Конструкторы

    public String getBirthday(int format)
    {
        switch (format)
        {
            case 1:
                return birthday.getDay() + "." + birthday.getMonth() + "." + birthday.getYear();
            case 2:
                return birthday.getYear() + "." + birthday.getMonth() + "." + birthday.getYear();
            case 3:
                return birthday.getMonth() + "." + birthday.getYear();
        }
        return birthday.toGMTString();
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = (new Date()).before(birthday) ? new Date() : birthday;
    }

    // Метод класса для сна (а что ещё надо студенту?) :)
    String Sleep() {
        return name + " засыпает...";
    }
}