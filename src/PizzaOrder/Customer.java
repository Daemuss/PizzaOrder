package PizzaOrder;

public class Customer
{
    private String name;
    private String phoneNumber;
    private String address;

    // Sets the customer name
    public void setName(String name)
    {
        this.name = name;
    }

    // Sets the customer phone number
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // Sets the customer address
    public void setAddress(String address)
    {
        this.address = address;
    }

    // Returns the customer information to print
    public String printCustomer()
    {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(name + phoneNumber + address);

        return stringBuilder.toString();
    }
}
