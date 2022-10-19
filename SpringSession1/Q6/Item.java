package SpringSession1.Q6;

public class Item
{
    private String name;
    private int price;

    public Item(String name, int price)
    {
        this.name=name;
        this.price=price;
    }

    public void itemInfo()
    {
        System.out.println("Item name - " + name);
        System.out.println("Item price - " + price);
    }
}
