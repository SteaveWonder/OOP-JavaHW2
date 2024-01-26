public class Main {
    /** Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине

     * Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать заказ и факт получения заказа.
     * Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
     * “персональных данных” abstract

     * Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

     1. Интерфейс QueueBehaviour, который описывает
     логику очереди – помещение в/освобождение из
     очереди, принятие/отдача заказа
     2. Интерфейс MarketBehaviour, который описывает
     логику магазина – приход/уход покупателей,
     обновление состояния магазина
     3. Класс Market, который реализовывает два
     вышеуказанных интерфейса и хранит в списке список
     людей в очереди в различных статусах
    */

    public static void main(String[] args) {


    }
}