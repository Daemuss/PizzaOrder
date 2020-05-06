package PizzaOrder;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import javax.xml.soap.Text;
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
        this.setGridPaneSettings(p);
        this.createFXComponents();
        this.addToGridPane(p);
    }

    // Set the grid pane settings
    private void setGridPaneSettings(GridPane p)
    {
        p.setPadding(new Insets(10, 10, 100, 10));
    }

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

    private void buttonPayEvent()
    {

    }

    private void buttonAnotherEvent()
    {

    }

    private void buttonCancelEvent()
    {

    }
}
