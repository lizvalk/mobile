public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int amount = 1100;
        int bonus = amount / 100;

        int result;
        if (amount > 1000) {
            result = startBalance + amount + bonus;
        } else {
            result = startBalance + amount;
        }
        System.out.println("Итоговая сумма на счету клиента: " + result);
    }
}