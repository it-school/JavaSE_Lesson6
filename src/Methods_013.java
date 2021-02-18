// Рекурсия (простая рекурсия).

// В теле метода Recursion на 19-й строке рекурсивно вызывается метод Recursion.
// Простая рекурсия -  вызов методом самого себя (самовызов). При каждом вызове строится новая копия метода.

class Methods_013 {

    private static void Recursion(int counter) {
        counter--;
        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            Recursion(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {
        Recursion(3);
    }
}
