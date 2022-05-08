import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CountNoOfSundays {

    public static void main(String[] args) {

        int sundays=0;
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Date format in which you want to enter the dates:");
            SimpleDateFormat sdf=new SimpleDateFormat(scan.nextLine());
            System.out.println("Enter the Start date:");
            Date start=sdf.parse(scan.nextLine());
            System.out.println("Enter the End date:");
            Date end=sdf.parse(scan.nextLine());
            int current=start.getDay();// 0 refers Sunday and 6 does Saturday
            if(current!=0)
                start.setDate(start.getDate()+(7-current));//set the start date to very first coming Sunday


            while(start.before(end)){
                sundays++;
                start.setDate(start.getDate()+7);
            }
            if(end.getDay()==0)
                sundays++;

            System.out.println("Total Sundays: "+sundays);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
