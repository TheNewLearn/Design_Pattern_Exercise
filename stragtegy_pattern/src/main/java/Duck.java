abstract class  Duck {
    //定義飛行行為接口變量
    private FlyBehavior flyBehavior;
    //定義嗚叫行為接口變量
    private QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    //傳入接口實例
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    //傳入接口實例
    public  void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }

    public void swim(){
        System.out.println("Swim");
    }

    public String performfly(){
       return flyBehavior.fly();
    }

    public String performquack(){
        return quackBehavior.quack();
    }

    public abstract void display();

}
