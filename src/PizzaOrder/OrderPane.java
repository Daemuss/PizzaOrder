package PizzaOrder;

import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class OrderPane
{
    private Customer customer;
    private Order order;
    private ArrayList<Pizza> pizzaList;
    private ArrayList<Size> sizeList;
    private ArrayList<Crust> crustList;
    private ArrayList<Topping> toppingList;
    private Label labelName, labelNumber, labelAddress;
    private TextField textFieldName, textFieldNumber, textFieldAddress;
    private Button buttonPay, buttonAnother, buttonCancel;
    private ToggleGroup toggleSize, toggleCrust;

    public OrderPane(GridPane p)
    {
        customer = new Customer();

        this.setGridPaneSettings(p);
        this.createFXComponents();
        this.addToGridPane(p);
        this.buttonPayEvent();
        this.buttonAnotherEvent();
        this.buttonCancelEvent();
        this.setSizeRadioButtons(p);
        this.setCrustRadioButton(p);
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
    }

    // Create new radio buttons and add them to the GridPane
    private void setSizeRadioButtons(GridPane p)
    {
        int i = 0;
        ArrayList<Size> pizzaSize = new ArrayList<>();

        Size smallSize = new Size("Small");
        Size bigSize = new Size("Big");

        pizzaSize.add(smallSize);
        pizzaSize.add(bigSize);

        for (Size size : pizzaSize)
        {
            i += 1;
            RadioButton rb = new RadioButton(size.getSizeName());
            rb.setToggleGroup(toggleSize);

            p.add(rb, 0, 3 + i);
        }
    }

    private void setCrustRadioButton(GridPane p)
    {
        int i = 0;
        ArrayList<Crust> pizzaCrust = new ArrayList<>();

        Crust crustThin = new Crust("Thin");
        Crust crustThick = new Crust("Thick");

        pizzaCrust.add(crustThin);
        pizzaCrust.add(crustThick);

        for (Crust crust : pizzaCrust)
        {
            i += 1;
            RadioButton rb = new RadioButton(crust.getCrustName());

            p.add(rb, 1, 3 + i);
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

        p.add(buttonPay, 0, 6);
        p.add(buttonAnother, 1, 6);
        p.add(buttonCancel, 2, 6);
    }

    // Pay button handler
    private void buttonPayEvent()
    {
        buttonPay.setOnAction(event -> {
            customer.setName(textFieldName.getText());
            customer.setPhoneNumber(textFieldNumber.getText());
            customer.setAddress(textFieldAddress.getText());

            System.out.println(customer.getCustomerInformation() + order.getOrderInformation());
        });
    }

    // Another button handler
    private void buttonAnotherEvent()
    {
        buttonAnother.setOnAction(event ->  {
            order = new Order(pizzaList);
            Pizza pizza = new Pizza();
            Size size = new Size("Small");
            pizza.setPizzaSize(size);

            pizzaList.add(pizza);
        });
    }

    // Cancel button handler
    private void buttonCancelEvent()
    {
        buttonCancel.setOnAction(event -> {

        });
    }
}
