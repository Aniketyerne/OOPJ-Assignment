import java.util.Scanner;
class Details{
    String customerName;
    long phoneNumber;
    int numberOfcalls;
    float durations;
    float amount;

    Details(String customerName,long phoneNumber,int numberOfcalls,float durations)
    {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.numberOfcalls = numberOfcalls;
        this.durations = durations;
    }

    void Phonebill()
    {
        if(numberOfcalls == 0)
        {
            this.amount = 10;
        }
        else if(numberOfcalls>100)
        {
            this.amount = (100*4)+((numberOfcalls-100)*1);
        }
        else{
            this.amount = numberOfcalls*4;
        }
        System.out.println("Telephone bill is "+amount+"Rs");
    }

}

class TelePhoneBill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter phone number: ");
        long phoneNumber = sc.nextLong();
        System.out.print("Enter number of calls made: ");
        int numberOfcalls = sc.nextInt();
        System.out.print("Enter duration of calls made(in minutes): ");
        float durations = sc.nextFloat();

        Details tb = new Details(customerName,phoneNumber,numberOfcalls,durations);
        tb.Phonebill();



    }
}