public class Main {
    public static void main(String[] args) {
        Cat boris = new Cat();
        boris.setBehavior(new MeowBehavior());
        boris.performBehavior();
        boris.setBehavior(new EatBehavior());
        boris.performBehavior();
        boris.setBehavior(new ScratchBehavior());
        boris.performBehavior();
    }
}