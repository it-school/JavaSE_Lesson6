// Перегрузка методов.

class Methods_011 {
    static void Operation()                                         // 1-я перегрузка.
    {
        Operation("val", 10, 12.2);
    }

    static void Operation(String value1)                            // 2-я перегрузка.
    {
        Operation(value1, 10, 12.2);
    }

    static void Operation(String value1, int value2)                // 3-я перегрузка.
    {
        Operation(value1, value2, 12.2);
    }

    static void Operation(String value1, int value2, double value3) // 4-я перегрузка.
    {
        System.out.println(value1 + "," + value2 + "," + value3);
    }

    public static void main(String[] args)
    {
        Operation();                  // 1-я перегрузка.
        Operation("val");      // 2-я перегрузка.
        Operation("val", 10);         // 3-я перегрузка.
        Operation("val", 10, 12.2);   // 4-я перегрузка.
    }
}
