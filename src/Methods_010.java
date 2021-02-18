// Перегрузка методов.

class Methods_010 {
    // Перегруженные методы могут отличаться типом и количеством аргументов, а также ref и out параметрами.

    private static void Function()                 // 1-я перегрузка.
    {
        System.out.println("Hello!");
    }

    private static void Function(String s)         // 2-я перегрузка.
    {
        System.out.println(s);
    }

    private static void Function(int i)            // 3-я перегрузка.
    {
        System.out.println(i);
    }

    private static void Function(double d)         // 4-я перегрузка.
    {
        System.out.println(d);
    }

    private static void Function(float d)         // 4-я перегрузка.
    {
        System.out.println(d);
    }

    private static void Function(String s, int i)  // 5-я перегрузка.
    {
        System.out.println(s + i);
    }

    private static void Function(int i, String s)  // 6-я перегрузка.
    {
        System.out.println(i + s);
    }

    // Перегруженные методы не могут отличаться возвращаемыми значениями!
    //static String Function(String s)     // 7-я перегрузка.
    //{
    //    return s;
    //}

    public static void main(String[] args) {
        Function();                  // 1-я перегрузка.
        Function("A");               // 2-я перегрузка.
        Function(1);                 // 3-я перегрузка.
        Function(Math.PI);              // 4-я перегрузка.
        Function("B ", 2);           // 5-я перегрузка.
        Function(3, " C");           // 6-я перегрузка.
    }
}
