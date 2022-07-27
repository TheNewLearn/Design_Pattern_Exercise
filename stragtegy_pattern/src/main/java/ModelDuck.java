public class ModelDuck extends Duck{
    public ModelDuck(FlyBehavior fb, QuackBehavior qb){
        super(fb,qb);
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }
}
