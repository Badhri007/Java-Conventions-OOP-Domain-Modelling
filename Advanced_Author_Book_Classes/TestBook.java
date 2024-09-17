

public class TestBook {
    public static void main(String args[])
    {
        Author[] authors = new Author[2];
        authors[0] = new Author("Dr.Kalam", "kalam@gmail.com", 'm');
        authors[1] = new Author("Satyajit Ray", "ray@yahoo.com", 'm');

        Book book=new Book("Wings of Fire",authors,2500,90);

        System.out.println(book);
    }
    
}
