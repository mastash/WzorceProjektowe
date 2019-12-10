package builder;

public interface BurgerBuilder {
    Burger build();

    BurgerBuilder setBread(String bread);

    BurgerBuilder setMeat(String meat);

    BurgerBuilder setSauce(String sauce);

    BurgerBuilder setVegetables(String vegetables);

}
