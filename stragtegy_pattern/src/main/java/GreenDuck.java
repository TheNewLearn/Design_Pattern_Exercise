public class GreenDuck extends Duck{
    public GreenDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        super(flyBehavior,quackBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm green");
    }
}
