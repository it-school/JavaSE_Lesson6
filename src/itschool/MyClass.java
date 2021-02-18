package itschool;

public class MyClass
{
	private final char symb;
	private int temperature1;
	private int n;

	public MyClass()
	{
		symb = '+';
		n = 1;
	}

	public MyClass(char symbol)
	{
		symb = symbol;
	}

	public int getTemperature1()
	{
		return temperature1;
	}

	public void setTemperature1(int temp)
	{
		if (temp > -273 && temp < 1000000) { temperature1 = temp; }
		else { temperature1 = 0; }
	}

	public void doIT(String text)
	{
		if (text == "") { text = "it"; }
		System.out.println("Just do " + text);

	}

	public void drawRectangle()
	{
		drawRectangle(5, 10, symb);
	}

	public void drawRectangle(int height, int width, char symbol)
	{
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(symbol);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

	public void drawRectangle(int height, int width)
	{
		drawRectangle(height, width, symb);
	}

	public void doNothingRecursively()
	{
		System.out.println(n++);
		if (n > 1000) { return; }
		doNothingRecursively();
	}
}
