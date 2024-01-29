import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    List<Actor> actors = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " enter to the shop");
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + " leave the shop");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " get in queue");
    }

    @Override
    public void takeOrder() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " take the order");
    }

    @Override
    public void giveOrder() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " make an order");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " leave the queue");
    }
}
