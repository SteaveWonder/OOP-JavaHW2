public class Human extends Actor {
    @Override
    String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
       isMakeOrderStatus = true;
    }

    @Override
    public void setTakeOrder() {
        isTakeOrderStatus = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderStatus;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderStatus;
    }
}
