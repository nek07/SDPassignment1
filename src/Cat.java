public class Cat {
    private ICatBehavior behavior;


    public void setBehavior(ICatBehavior behavior) {
        this.behavior = behavior;
    }

    public void performBehavior() {
        behavior.performBehavior();
    }
}
