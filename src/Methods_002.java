// Методы (Функции).

class Methods_002 {

    // На 8-й строке, создаем метод с именем Function, который ничего не принимает и возвращает строковое значение.
    // В теле метода, используя ключевое слово return, возвращаем строку - Hello!

    static String Function() {
        return "Hello!";
    }

    public static void main(String[] args) {
        // В теле метода main на 16-й строке, создаем строковую локальную переменную с именем str
        // и присваиваем ей возвращаемое значение метода Function.

        String str = Function();

        System.out.println(str);

    }
}
