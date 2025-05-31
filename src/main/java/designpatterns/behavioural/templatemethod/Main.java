package designpatterns.behavioural.templatemethod;

public class Main {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println("---");

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
