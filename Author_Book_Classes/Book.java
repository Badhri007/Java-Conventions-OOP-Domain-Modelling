
public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity=0;

    public Book(String name,Author author,double price)
    {
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public Book(String name,Author author,double price,int quantity)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double newPrice)
    {
        this.price=newPrice;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int newQuantity)
    {
        this.quantity=newQuantity;
    }

    public String toString()
    {
        String bookDetails= "Book[ name= " + name+" , Author"+author+" , price="+price+" , quantity="+quantity+ " ] ";
        return bookDetails;
    }

    
}
