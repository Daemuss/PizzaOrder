package PizzaOrder;

import java.util.ArrayList;

public class Pizza
{
    private Size pizzaSize;
    private Crust pizzaCrust;
    private ArrayList<Topping> pizzaTopping;

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

    // Sets the pizza topping list
    public void setPizzaToppingList(ArrayList<Topping> pizzaTopping)
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

    // Returns a list with pizza toppings
    public ArrayList<Topping> getPizzaToppingList()
    {
        return pizzaTopping;
    }
}
