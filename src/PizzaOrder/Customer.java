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
    public String getCustomerInformation()
    {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("CUSTOMER INFORMATION");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("========================");
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Name: ");
        stringBuilder.append(name);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Phone number: ");
        stringBuilder.append(phoneNumber);
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Address: ");
        stringBuilder.append(address);
        stringBuilder.append(System.lineSeparator());

        return stringBuilder.toString();
    }
}
