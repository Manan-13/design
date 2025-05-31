package designpatterns.behavioural.templatemethod;

public abstract class CaffeineBeverage {

    // Template Method — final so subclasses can't override
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Steps to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
}
