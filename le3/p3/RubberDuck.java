public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
