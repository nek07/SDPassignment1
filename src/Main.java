public class Main {
    public static void main(String[] args) {
        Cat boris = Cat.getInstance();
        Cat moris = Cat.getInstance();
        boris.setBehavior(new MeowBehavior());
        boris.performBehavior();
        boris.setBehavior(new EatBehavior());
        boris.performBehavior();
        boris.setBehavior(new ScratchBehavior());
        boris.performBehavior();

        System.out.println(moris==boris); //if it is true, that means the class has only one instance
    }
}