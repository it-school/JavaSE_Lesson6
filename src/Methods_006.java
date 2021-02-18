// Методы (Функции).

class Methods_006 {
    // Методы, которые возвращают логическое значение, называют методами-предикатами.

    static boolean And(boolean a, boolean b)
    {
        return a && b;
    }

    public static void main(String[] args) {
        boolean operand1 = true, operand2 = true;

        boolean result = And(operand1, operand2);

        System.out.println(operand1 + "+" + operand2 + "=" + result); // true
    }
}
