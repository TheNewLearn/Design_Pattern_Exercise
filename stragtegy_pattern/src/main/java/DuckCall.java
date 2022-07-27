public class DuckCall {
    private FlyBehavior fb = new FlyNotWay();
    private QuackBehavior qb = new Quack();

    public String performquack(){
        return qb.quack();
    }

    public String performfly(){
        return fb.fly();
    }

    public void display(){
        System.out.println("I'm Duck call");
    }
}
