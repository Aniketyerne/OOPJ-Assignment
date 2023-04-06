import java.util.Scanner;
class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill(String customerName,double unitsConsumed)
    {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
    }

    void CalculateBillAmount(){
        System.out.println("customer Name :"+customerName);
        System.out.println("units Consumed :"+unitsConsumed);
        if(unitsConsumed<=100)
        {
            this.billAmount = (unitsConsumed*5);
            System.out.print("Bill amount is "+billAmount+"Rs");
        }
        else if((unitsConsumed>100) && (unitsConsumed<=200))
        {
           this.billAmount = (unitsConsumed*7);
           System.out.print("Bill amount is "+billAmount+"Rs"); 
        }
        else{
            this.billAmount = (unitsConsumed*10);
            System.out.print("Electricity Bill amount is "+billAmount+"Rs");
        }

    }
}

class ElectricBill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter customer name");
        String customerName = sc.nextLine();

        System.out.println("Enter unit consumed");
        double unitConsumed = sc.nextDouble();

        ElectricityBill eb = new ElectricityBill(customerName,unitConsumed);
        eb.CalculateBillAmount();

        //System.out.println("Enter customer name");
        //double billAmount = sc.nextDouble();

        

    }
}