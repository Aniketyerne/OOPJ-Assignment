//a program to find minimum and maximum number as well as to add two double numbers using methods of Double

class Maxmin{
    public static void main(String args[])
    {
        double a = 234;
        double b = 456;
        double c = Double.min(a,b);
        double d = Double.max(a,b);
        double s = Double.sum(a,b);
        System.out.println("minimum value is "+c);
        System.out.println("maximum value is "+d);
        System.out.println("sum is "+s);

    }
}