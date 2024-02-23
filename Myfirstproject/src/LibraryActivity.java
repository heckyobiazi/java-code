import java.util.Date;
import javax.swing.*;


public class LibraryActivity {
  public static void main(String[] args)
  {
    Date realdate = new Date(1954);
    Author auth = new Author(1892, "J.R.R. Tokien");
    auth.setPassYear(1973);


    Book bk = new Book("Fellowship of the rings", auth, "George Alle & Unwin");
    bk.setPublishedYear(realdate);

    String Message = bk.getName() +" " + bk.getAuthorName() + " " + bk.getPublishedYear().getYear();
    JOptionPane.showMessageDialog(null,Message);
  }

}
