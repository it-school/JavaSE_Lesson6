// Методы (Функции).

class Methods_004 {

    // На 9-й строке, создаем метод с именем Function, который принимает один строковой аргумент и возвращает строковое значение.
    // В теле метода, строковой локальной переменной sentence, присваиваем конкатенацию строк и аргумента,
    // используя ключевое слово return, возвращаем значение переменной sentence.

    private static String Function(String name) {
        String sentence = "Hello " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        // В теле метода main на 19-й строке, создаем строковую локальную переменную с именем sentence,
        // присваиваем ей возвращаемое значение метода Function, которому в качестве аргумента передаем строку - Alex.

        String sentence = Function("Alex");

        System.out.println(sentence);
    }
}
