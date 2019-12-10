package builder;

public class Main {
    public static void main(String[] args) {
        BurgerBuilder builder = new BurgerBuilderImpl();

        builder.setBread("white");
        builder.setMeat("medium");
        builder.setSauce("garlic");
        builder.setVegetables("tomato");

        Burger burger = builder.build();
        System.out.println(burger.toString());
    }
}
