import java.util.Scanner;
class Tollcalc{
    String VehicleType;
    int NumberOfAxles;
    double DistTravelled;
    double Tollfee;
    double Tollamt;
    Scanner sc = new Scanner(System.in);

    Tollcalc(){

    }
    
    Tollcalc(String VehicleType, int NumberOfAxles, double DistTravelled, double Tollfee, double Tollamt )
    {
        this.VehicleType = VehicleType;
        this.NumberOfAxles = NumberOfAxles;
        this.DistTravelled = DistTravelled;
        this.Tollfee = Tollfee;
        this.Tollamt = Tollamt;

    }

    int menulist(){
        System.out.println("1. Enter vehicle type (car, van, bus, or truck)");
        System.out.println("2. Enter number of axles");
        System.out.println("3. Enter distance travelled");
        System.out.println("4. Calculate toll fee");
        System.out.println("5. Generate bill");
        System.out.println("0. Exit");
        return sc.nextInt();
    }
    void generate_bill()
    {
        System.out.println(" vehicle type    : "+this.VehicleType);
        System.out.println(" number of axles : "+this.NumberOfAxles);
        System.out.println(" Distance        : "+this.DistTravelled);
        System.out.println(" Toll Fee        : "+this.Tollfee);
        System.out.println(" processing fee  : "+2);
        System.out.println(" Total Amt Due   :"+this.Tollamt);

    }

    void cal_toll_fee(String VehicleType, int NumberOfAxles){
        if(VehicleType.equalsIgnoreCase("car")||VehicleType.equalsIgnoreCase("van")||VehicleType.equalsIgnoreCase("bus"))
        {
            this.Tollfee=(this.DistTravelled*this.NumberOfAxles*0.25);
            this.Tollamt=2+this.Tollfee;
        }
        else if(VehicleType.equalsIgnoreCase("truck"))
        {
            this.Tollfee= (this.DistTravelled*this.NumberOfAxles*0.50);
        }

    

    }

}

class Tollbill{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        Tollcalc tb = new Tollcalc();
        while((choice = tb.menulist()) != 0)
        {
            switch(choice)
            {
                case 1:
                    System.out.print("Enter vehicle type (car, van, bus, or truck) :");
                    tb.VehicleType=sc.nextLine(); break;
                case 2:
                    System.out.print("Enter number of axles :");
                    tb.NumberOfAxles=sc.nextInt(); break;
                case 3:
                    System.out.print("Enter distance travelled :");
                    tb.DistTravelled=sc.nextDouble();
                case 4:
                    System.out.print("Calculate toll fee :");
                    tb.cal_toll_fee(tb.VehicleType, tb.NumberOfAxles);
                case 5:
                    System.out.print("Generate bill :");
                    tb.generate_bill();

            }
        }

    }
}


/**import java.util.Scanner;
class Employee{
    private String name;
    private int empid;
    private float salary;

Employee(){
    this.name = " ";
    this.empid = 0;
    this.salary = 0;
}
public String getName(){
     return this.name;
}
public void setName(String name){
    this.name = name;
}
public int getEmpid(){
    return this.empid;
}
public void setEmpid(int empid){
    this.empid = empid;
}
public float getSalary(){
    return this.salary;
}
public void setMarks(float salary){
    this.salary = salary;
}
}
class EmployeeTest{
    private static Scanner sc = new Scanner(System.in);
    int a;
    private Employee emp = new Employee();
    public void acceptRecord(){
        System.out.println("Enter name : ");
        sc.nextLine();
        emp.setName (sc.nextLine());
        System.out.println("Enter the Empid : ");
        emp.setEmpid(sc.nextInt());
        System.out.println("Enter the salary : ");
        emp.setMarks(sc.nextFloat());
    }   
    public void printRecord(){
        System.out.println(emp.getName() + "  " + emp.getEmpid() + "  " + emp.getSalary());
    
    }
    public static int menulist(){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
}
class Program2{
    public static void main(String [] args){
      int choice;
      EmployeeTest test = new EmployeeTest();
      while((choice = EmployeeTest.menulist())!=0){
        switch(choice){
        case 1:
            test.acceptRecord();
            break;
        case 2:
            test.printRecord();
            break;
        }
      }
      
    }
}*/