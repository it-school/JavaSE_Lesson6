// Методы (Процедуры).

class Methods_001 {
    // На 8-й строке, создаем метод с именем Procedure, который ничего не принимает и ничего не возвращает.
    // В теле метода, на 9-й строке выводим на экран строку - Hello!

    static void Procedure() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        // В теле метода Main на 14-й строке, вызываем метод Procedure.
        Procedure();
    }
}