// Пример правильного множественного возврата из метода.

class Methods_007
{
    private static String Compare(int value1, int value2)
    {
        if (value1 < value2)
        {
            return "Comparison: " + value1 + "  Less Than " + value2;
        }
        else if (value1 > value2)
        {
            return "Comparison: " + value1 + "  Greater Than " + value2;
        }
        else
            return "Comparison Equal";
    }

    public static void main(String[] args)
    {
        int operand1 = 2, operand2 = 1;

        String result = Compare(operand1, operand2);

        System.out.println(result);
    }
}
