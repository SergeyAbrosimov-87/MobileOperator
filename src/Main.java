public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int deposit = 1100;
        int bonus;
        System.out.println("На Вашем счету: " + accountBalance + " руб.");
        System.out.println("Вы пополнили свой баланс на: " + deposit + " руб.");

        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int balance = deposit + accountBalance + bonus;
        System.out.println("Ваш итоговый счет: " + balance + " руб.");
        System.out.println("Количество бонусных рублей: " + bonus);

    }
}
