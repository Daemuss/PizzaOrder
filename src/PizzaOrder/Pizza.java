package PizzaOrder;

public class Pizza
{
    private Size pizzaSize;
    private Crust pizzaCrust;
    private Topping pizzaTopping;

    public Pizza()
    {

    }

    // Sets the pizza size
    public void setPizzaSize(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }

    // Sets the pizza crust
    public void setPizzaCrust(Crust pizzaCrust)
    {
        this.pizzaCrust = pizzaCrust;
    }

    // Sets the pizza topping
    public void setPizzaTopping(Topping pizzaTopping)
    {
        this.pizzaTopping = pizzaTopping;
    }

    // Returns the pizza size
    public Size getPizzaSize()
    {
        return pizzaSize;
    }

    // Returns the pizza crust
    public Crust getPizzaCrust()
    {
        return pizzaCrust;
    }

    // Returns the pizza topping
    public Topping getPizzaTopping()
    {
        return pizzaTopping;
    }
}
