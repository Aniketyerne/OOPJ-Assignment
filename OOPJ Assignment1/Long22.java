// Write a program to find minimum and maximum number as well as to add two long numbers using methods of Long.

class Long1{
    public static void main(String args[])
    {
        Long num1 = 2000L;
        long num2 = 3000L;
        Long c = Long.max(num1,num2);
        Long d = Long.min(num1,num2);
        Long e = Long.sum(num1,num2);
        System.out.println("maximum is :"+c);
        System.out.println("minimum is :"+d);
        System.out.println("sum is :"+e);

    }
}
