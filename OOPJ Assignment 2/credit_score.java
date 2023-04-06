import java.util.Scanner;
class credit_score_calculator{
private int credit_history;
private double credit_utilization;
private boolean payment_history;
public int getCredit_history() {
    return credit_history;
}
public void setCredit_history(int credit_history) {
    this.credit_history = credit_history;
}
public double getCredit_utilization() {
    return credit_utilization;
}
public void setCredit_utilization(double credit_utilization) {
    this.credit_utilization = credit_utilization;
}
public boolean isPayment_history() {
    return payment_history;
}
public void setPayment_history(boolean payment_history) {
    this.payment_history = payment_history;
}
public credit_score_calculator(int credit_history, double credit_utilization, boolean payment_history) {
    this.credit_history = credit_history;
    this.credit_utilization = credit_utilization;
    this.payment_history = payment_history;
}

public credit_score_calculator(){

}
int calculateCreditScore(){
    if(this.payment_history)
    {
        return ((credit_history*15)+((int)(credit_utilization*30))+55);
    }
    else return ((credit_history*15)+((int)(credit_utilization*30))+35);

}

}

public class credit_score {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter credit history");
        int cred_hist=sc.nextInt();
        System.out.println("Enter credit utilization");
        double cred_util=sc.nextDouble();
        System.out.println("Enter payment history 1.good 0.bad");
        boolean flag;
        if(sc.nextInt()==1)
        {
            flag=true;
        }
        else flag=false;


        credit_score_calculator csc= new credit_score_calculator(cred_hist,cred_util,flag);
        int cscore=csc.calculateCreditScore();
        System.out.println("Credit Score is "+cscore);
        
    }
    
}
