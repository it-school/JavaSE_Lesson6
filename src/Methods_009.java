// Пример: Использование сторожевого оператора, для защиты номинального варианта.

class Methods_009 {
    private static String Function(String name) {
        // Выполняем проверку. При обнаружении ошибок завершаем работу.

        if (name.equals("fool"))   // Сторожевой оператор.
        {
            return "Вы использовали недопустимое слово.";
        }

        // Код номинального варианта.

        String sentence = "Hello, " + name + "!";

        return sentence;
    }

    public static void main(String[] args) {
        String sentence = Function("fool");

        System.out.println(sentence);
    }
}
