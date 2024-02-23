import java.util.Date;

public class Book {
     public String name;
     Author aut = new Author(0, name);
     public String publisher;
     Date publishedYear = new Date();

     public Book(String n, Author a)
     {
        this.name = n;
        this.aut = a;
     }

     public Book(String n, Author a, String p)
     {
        this(n,a);
        this.publisher = p;
     }

     public void setPublisher(String p)
     {
        this.publisher = p;
     }

     public void setPublishedYear(Date d)
     {
        this.publishedYear = d;
     }

     public String getName()
     {
        return name;
     }
   
     public String getAuthorName()
     {
        return aut.name;
     }

     public Date getPublishedYear()
     {
        return publishedYear;
     }

     public String getPublisher()
     {
      return publisher;
     }
}
