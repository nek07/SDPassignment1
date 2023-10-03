public class Cat {
    private ICatBehavior behavior;
    private static Cat instance;


    public void setBehavior(ICatBehavior behavior) {
        this.behavior = behavior;
    }

    public void performBehavior() {
        behavior.performBehavior();
    }
    public static Cat getInstance() {
        if (instance == null) {
            instance = new Cat();
        }
        return instance;
    }
}
