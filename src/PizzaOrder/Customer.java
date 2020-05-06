package PizzaOrder;

public class Customer
{
    private String name;
    private String phoneNumber;
    private String addres;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setAddres(String addres)
    {
        this.addres = addres;
    }

    public String printCustomer()
    {
        return this.name + "\n"
                + this.phoneNumber + "\n"
                + this.addres;
    }
}
