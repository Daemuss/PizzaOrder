package PizzaOrder;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order
{
    private ArrayList<Pizza> pizzaList;

    public Order()
    {
        this.pizzaList = new ArrayList<>();
    }

    public void addPizza(Pizza pizza)
    {
        this.pizzaList.add(pizza);
    }

    public int getAmountPizza()
    {
        return this.pizzaList.size();
    }

    // Returns the pizza order to print
    public String getOrderInformation()
    {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("========================");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("ORDER");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("========================");
        stringBuilder.append(System.lineSeparator());

        for (Pizza pizza : pizzaList)
        {
            stringBuilder.append("Size: ");
            stringBuilder.append(pizza.getPizzaSize().getSizeName());
            stringBuilder.append(", Crust: ");
            stringBuilder.append(pizza.getPizzaCrust().getCrustName());
            stringBuilder.append(", Topping: ");
//            stringBuilder.append(pizza.getPizzaTopping().getToppingName());
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
