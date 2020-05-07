package PizzaOrder;

import java.util.ArrayList;

public class Order
{
    private ArrayList<Pizza> pizzaList;

    public Order(ArrayList<Pizza> pizzaList)
    {
        this.pizzaList = pizzaList;
    }

    // Returns the pizza order to print
    public String getOrderInformation()
    {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("========================");
        stringBuilder.append(System.lineSeparator());

        for (Pizza pizza : pizzaList)
        {
            stringBuilder.append(pizza.getPizzaSize().getSizeName());
        }

        return stringBuilder.toString();
    }
}
