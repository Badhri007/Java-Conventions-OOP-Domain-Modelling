
public class Library {
    public static void main(String args[])
    {
        Author author=new Author("Dr.Kalam","badhrisambath2003@gmail.com",'m');

        System.out.println();
        System.out.println("Author Details:"+ author);

        System.out.println("Author name:"+ author.getName());
        author.setEmail("badhri@gmail.com");
        System.out.println("Author Email:"+author.getEmail());
        System.out.println("Author Gender:" + author.getGender());

        System.out.println();


        Book book=new Book("Wings of Fire",author,200.08,28);
        System.out.println("Book Details : "+book);

        book.setPrice(1000);
        System.out.println("New Price : "+ book.getPrice());

        book.setQuantity(17);
        System.out.println("New Quantity : "+ book.getQuantity());

        System.out.println("Book name : "+ book.getName());
        System.out.println("Author name : "+ book.getAuthor().getName());
        System.out.println("Author email  :"+ book.getAuthor().getEmail());
        System.out.println("Author gender  :"+ book.getAuthor().getGender());

        System.out.println();


        Book sequelBook=new Book("Galaxy", new Author("Stephen","stephen@gmail.com",'m'), 900);
        System.out.println(sequelBook);

        System.out.println();

    }
}
