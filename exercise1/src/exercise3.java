import javax.swing.*;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class exercise3 {
    public static void main(String[] args) {

    GregorianCalendar Today = new GregorianCalendar();
    int date = Today.get(Calendar.DATE);
    int day = Today.get(Calendar.DAY_OF_WEEK);
    int month = Today.get(Calendar.MONTH); // it starts counting from 0 for the month
    int year = Today.get(Calendar.YEAR);

    String realday;
    String realmonth; 

    switch(day)
    {
        case 1: 
            realday = "Sunday";
            break;
            case 2: 
            realday = "Monday";
            break;
            case 3: 
            realday = "Tuesday";
            break;
            case 4: 
            realday = "Wednesday";
            break;
            case 5: 
            realday = "Thursday";
            break;
            case 6: 
            realday = "Friday";
            break;
            case 7: 
            realday = "Saturday";
            break;
            default: 
            realday = "omo no date today o";
            break;
    }
       switch(month)
       {
        case 0:
           realmonth = "January";
           break;
           case 1:
           realmonth = "February";
           break;
           case 2:
           realmonth = "March";
           break;
           case 3:
           realmonth = "April";
           break;
           case 4:
           realmonth = "May";
           break;
           case 5:
           realmonth = "June";
           break;
           case 6:
           realmonth = "July";
           break;
           case 7:
           realmonth = "August";
           break;
           case 8:
           realmonth = "September";
           break;
           case 9:
           realmonth = "Ocotober";
           break;
           case 10:
           realmonth = "November";
           break;
           case 11:
           realmonth = "December";
           break;
           default:
           realmonth = "no month today , happy new month";
           break;
       }



   int answer =  JOptionPane.showConfirmDialog(null, "Do you want to see the date of today");
    if(answer == 0 )
    {
        JOptionPane.showMessageDialog(null, "Today's date is " + date + " " + realday + " " + realmonth + " " + year);
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Great you already know today's date");
    }



    }
}
