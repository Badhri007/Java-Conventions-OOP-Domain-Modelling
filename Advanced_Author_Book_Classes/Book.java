

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int quantity=0;

    public Book(String name,Author[] authors,double price)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public Book(String name,Author[] authors,double price,int quantity)
    {
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName()
    {
        return name;
    }

    public Author[] getAuthors()
    {
        return authors;
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

    public String toString() {
        StringBuilder authorsDetails = new StringBuilder();
        for (Author author : authors) {
            authorsDetails.append(author.toString()).append(",");
        }
        String bookDetails = "Book [ name=" + name + " , authors:" + "{ Author=" + authorsDetails +"} " +", price=" + price + " , quantity=" + quantity + " ] ";
        return bookDetails;
    }
    

    
}
