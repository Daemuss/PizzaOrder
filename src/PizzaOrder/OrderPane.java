package PizzaOrder;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.lang.reflect.Array;
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

    public OrderPane(GridPane p)
    {
        customer = new Customer();

        this.setGridPaneSettings(p);
        this.createFXComponents();
        this.addToGridPane(p);
        this.buttonPayEvent();
        this.buttonAnotherEvent();
        this.buttonCancelEvent();
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

    // Experimentation with the ArrayList
    private void arrayListExperiment()
    {
        ArrayList<Size> pizzaSize = new ArrayList<>();

        Size sizeOne = new Size();
        sizeOne.setSizeName("Small");

        Size sizeTwo = new Size();
        sizeTwo.setSizeName("Big");

        pizzaSize.add(sizeOne);
        pizzaSize.add(sizeTwo);

        for (Size size : pizzaSize)
        {
            System.out.println(size.getSizeName());
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

        p.add(buttonPay, 0, 4);
        p.add(buttonAnother, 1, 4);
        p.add(buttonCancel, 2, 4);
    }

    // Pay button handler
    private void buttonPayEvent()
    {
        buttonPay.setOnAction(event -> {
            customer.setName(textFieldName.getText());
            customer.setPhoneNumber(textFieldNumber.getText());
            customer.setAddress(textFieldAddress.getText());

            System.out.println(customer.printCustomer());
        });
    }

    // Another button handler
    private void buttonAnotherEvent()
    {
        buttonAnother.setOnAction(event ->  {
            this.arrayListExperiment();
        });
    }

    // Cancel button handler
    private void buttonCancelEvent()
    {
        buttonCancel.setOnAction(event -> {

        });
    }
}
