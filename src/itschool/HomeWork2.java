package itschool;

public class HomeWork2
{
	double usd;
	double eur;
	double gbp;

	public HomeWork2(double usd, double eur, double gbp)
	{
		this.usd = usd;
		this.eur = eur;
		this.gbp = gbp;
	}

	public String exchange(double money, CurrencyType currencyType)
	{
		double result = 0;
		switch (currencyType) {
			case USD:
				result = money * usd;
				break;
			case EUR:
				result = money * eur;
				break;
			case GBP:
				result = money * gbp;
				break;

		}
		return "" + money + " " + currencyType + " = " + result + " " + CurrencyType.UAH;
	}
}
