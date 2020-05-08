package PizzaOrder;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class OrderPane
{
    private Customer customer;
    private Order order;
    private ArrayList<Size> sizeList;
    private ArrayList<Crust> crustList;
    private ArrayList<Topping> toppingList;
    private Label labelName, labelNumber, labelAddress;
    private TextField textFieldName, textFieldNumber, textFieldAddress;
    private Button buttonPay, buttonAnother, buttonCancel;
    private ToggleGroup toggleSize, toggleCrust;
    private ToggleGroup toppingGroup;
    private CheckBox checkBox;

    public OrderPane(GridPane p)
    {
        customer = new Customer();
        order = new Order();

        this.setGridPaneSettings(p);
        this.createFXComponents();
        this.addToGridPane(p);
        this.buttonPayEvent();
        this.buttonAnotherEvent();
        this.buttonCancelEvent();
        this.setSizeRadioButtons(p);
        this.setCrustRadioButton(p);
        this.setToppingCheckboxes(p);
    }

    // Set the grid pane settings
    private void setGridPaneSettings(GridPane p)
    {
        p.setPadding(new Insets(10, 10, 100, 10));
    }

    // Creates new FX components
    private void createFXComponents()
    {
        labelName = new Label("Name:");
        labelNumber = new Label("Number:");
        labelAddress = new Label("Address:");

        textFieldName = new TextField();
        textFieldNumber = new TextField();
        textFieldAddress = new TextField();

        buttonPay = new Button("Pay");
        buttonAnother = new Button("Order another pizza");
        buttonCancel = new Button("Cancel");

        toggleSize = new ToggleGroup();
        toggleCrust = new ToggleGroup();

        toppingGroup = new ToggleGroup();
    }

    // Create new radio buttons and add them to the GridPane
    private void setSizeRadioButtons(GridPane p)
    {
        int i = 0;
        sizeList = new ArrayList<>();

        Size smallSize = new Size("Small");
        Size mediumSize = new Size("Medium");
        Size bigSize = new Size("Big");

        sizeList.add(smallSize);
        sizeList.add(mediumSize);
        sizeList.add(bigSize);

        for (Size size : sizeList)
        {
            i += 1;
            RadioButton rb = new RadioButton(size.getSizeName());
            rb.setUserData(size.getSizeName());
            rb.setToggleGroup(toggleSize);

            p.add(rb, 0, 3 + i);
        }
    }

    private void setCrustRadioButton(GridPane p)
    {
        int i = 0;
        crustList = new ArrayList<>();

        Crust crustThin = new Crust("Thin");
        Crust crustThick = new Crust("Thick");

        crustList.add(crustThin);
        crustList.add(crustThick);

        for (Crust crust : crustList)
        {
            i += 1;
            RadioButton rb = new RadioButton(crust.getCrustName());
            rb.setUserData(crust.getCrustName());
            rb.setToggleGroup(toggleCrust);

            p.add(rb, 1, 3 + i);
        }
    }

    private void setToppingCheckboxes(GridPane p)
    {
        int i = 0;
        toppingList = new ArrayList<>();

        Topping toppingPepperoni = new Topping("Pepperoni");
        Topping toppingMushrooms = new Topping("Mushrooms");
        Topping toppingAnchovies = new Topping("Anchovies");

        toppingList.add(toppingPepperoni);
        toppingList.add(toppingMushrooms);
        toppingList.add(toppingAnchovies);

        for (Topping topping : toppingList)
        {
            i += 1;
            checkBox = new CheckBox(topping.getToppingName());

            p.add(checkBox, 2, 3 + i);
        }
    }

    // Adds FX components to the GridPane
    private void addToGridPane(GridPane p)
    {
        p.add(labelName, 0, 0);
        p.add(labelNumber, 0, 1);
        p.add(labelAddress, 0, 2);

        p.add(textFieldName, 1, 0);
        p.add(textFieldNumber, 1, 1);
        p.add(textFieldAddress, 1, 2);

        p.add(buttonPay, 0, 7);
        p.add(buttonAnother, 1, 7);
        p.add(buttonCancel, 2, 7);
    }

    // Adds pizza to order
    private void addToOrder()
    {
        Pizza pizza = new Pizza();
        order.getPizzaList().add(pizza);
        Size size = new Size(toggleSize.getSelectedToggle().getUserData().toString());
        Crust crust = new Crust(toggleCrust.getSelectedToggle().getUserData().toString());
        Topping topping = new Topping(checkBox.getText());
        pizza.setPizzaSize(size);
        pizza.setPizzaCrust(crust);
        pizza.setPizzaTopping(topping);
    }

    // Prints a receipt
    private void printReceipt()
    {
        System.out.println(customer.getCustomerInformation() + order.getOrderInformation());
    }

    // Pay button handler
    private void buttonPayEvent()
    {
        buttonPay.setOnAction(event -> {
            customer.setName(textFieldName.getText());
            customer.setPhoneNumber(textFieldNumber.getText());
            customer.setAddress(textFieldAddress.getText());

            if(order.getPizzaList().size() == 0)
            {
                this.addToOrder();
            }
            this.printReceipt();

            order.getPizzaList().removeAll(order.getPizzaList());
        });
    }

    // Another button handler
    private void buttonAnotherEvent()
    {
        buttonAnother.setOnAction(event ->  {
            this.addToOrder();
        });
    }

    // Cancel button handler
    private void buttonCancelEvent()
    {
        buttonCancel.setOnAction(event -> {
            textFieldName.setText("");
            textFieldNumber.setText("");
            textFieldAddress.setText("");
            order.getPizzaList().removeAll(order.getPizzaList());
        });
    }
}
