import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;  

class Program1{
    public static void main1(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.print("Enter the date in the format dd/mm/yyyy : ");
        String str = sc.nextLine();
        System.out.println( str );
        Date date = sdf.parse(str);
        System.out.println( date );
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = sdf2.format(date);
        System.out.println( strDate );
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        String strDate1 = sdf3.format(date);
        System.out.println( strDate1 );
    }
    public static void main2(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss"); 
        System.out.print("Enter the time in the format hh:mm:ss: ");
        String str = sc.nextLine();
        System.out.println( str );
        Date date = sdf.parse(str);
        System.out.println( date );
        SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
        String strDate = sdf2.format(date);
        System.out.println( strDate );
        SimpleDateFormat sdf3 = new SimpleDateFormat("kk:mm");
        String strDate1 = sdf3.format(date);
        System.out.println( strDate1 );
    }
    public static void main(String [] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.print("Enter the date in the format dd/mm/yyyy : ");
        String strdate = sc.nextLine();
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm:ss"); 
        System.out.print("Enter the time in the format hh:mm:ss: "); 
        String strtime = sc.nextLine();
        System.out.println( strdate + " " + strtime );
        Date date = sdf.parse(strdate);
        Date time = sdf1.parse(strtime);
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        String strdate1 = sdf2.format(date);
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
        String strtime1 = sdf3.format(time);
        System.out.println( strdate1 + " " + strtime1 );
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
        String strdate2 = sdf4.format(date);
        SimpleDateFormat sdf5 = new SimpleDateFormat("hh:mm");
        String strtime2 = sdf5.format(time);
        System.out.println( strdate2 + " " + strtime2 );

        
    }
}
    