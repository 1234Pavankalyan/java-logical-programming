import java.util.*;
class date2{
  public static void main(String args[]){
    Calendar cal=Calendar.getInstance();
    cal.set(1999,8,16);
    System.out.println("date is ...." +cal.get(Calendar.DATE));
     System.out.println("MONTH is ...." +cal.get(Calendar.MONTH)); 
      System.out.println("YEAR is ...." +cal.get(Calendar.YEAR));
      System.out.println("DAY OF MONTH is ...." +cal.get(Calendar.DAY_OF_MONTH));
      System.out.println("DAY OF WEEK ...." +cal.get(Calendar.DAY_OF_WEEK));
      System.out.println("date OF YEAR ...." +cal.get(Calendar.DAY_OF_YEAR));
      System.out.println("WEEK OF MONTH ...." +cal.get(Calendar.WEEK_OF_MONTH));
    System.out.println("WEEK OF YEAR ...." +cal.get(Calendar.WEEK_OF_YEAR));
  }
}