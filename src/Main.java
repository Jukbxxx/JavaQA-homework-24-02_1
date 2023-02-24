public class Main {
    public static void main(String[] args) {

        int ticketCost = 1000; // Переменная, в которой хранится стоимость билета
        int milePerCost = 20; // Переменная, в которой хранится количество рублей для одной бонусной мили
        int mileForBonus = ticketCost / milePerCost; // Переменная, в которой хранится ответ по формуле расчета бонусов
        System.out.println("Мили к начислению: " + mileForBonus);

    }
}