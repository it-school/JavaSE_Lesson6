package itschool;

public class HomeWork1 {
   public int credit;
   public int payed = 0;

   public HomeWork1() {
      credit = 0;
   }

   public HomeWork1(int value) {
      credit = value;
   }

   public String moneyCredit(int amount) {
      payed += amount;
      return ("Уплатили " + amount + " грн.\t" + (payed > credit ? "Переплата: " + (payed - credit) + " грн." : payed == credit ?
              "Кредит погашен" :
              "Задолженность: " + (credit - payed) + " грн."));
   }
}


