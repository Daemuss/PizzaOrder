package PizzaOrder;

public class Pizza
{
    private Size pizzaSize;
    private Crust pizzaCrust;
    private Topping pizzaTopping;

    public Pizza()
    {

    }

    public void setPizzaSize(Size pizzaSize)
    {
        this.pizzaSize = pizzaSize;
    }

    public void setPizzaCrust(Crust pizzaCrust)
    {
        this.pizzaCrust = pizzaCrust;
    }

    public void setPizzaTopping(Topping pizzaTopping)
    {
        this.pizzaTopping = pizzaTopping;
    }

    public Size getPizzaSize()
    {
        return pizzaSize;
    }

    public Crust getPizzaCrust()
    {
        return pizzaCrust;
    }

    public Topping getPizzaTopping()
    {
        return pizzaTopping;
    }
}
