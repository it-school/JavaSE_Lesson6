// Рекурсия (сложная рекурсия).

// Сложная рекурсия -  вызов методом себя, через другой метод.

class Methods_015 {
    private static void Recursion(int counter) {
        counter--;
        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            Method(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    private static void Method(int counter) {
        System.out.println("Первая половина метода Method: " + counter);

        Recursion(counter);

        System.out.println("Вторая половина метода Method: " + counter);
    }

    public static void main(String[] args) {
        Method(3);
    }
}
