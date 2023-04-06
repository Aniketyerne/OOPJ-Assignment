class Long2{
    public static void main(String args[])
    {
        float num1 = 200.5f;
        float num2 = 300.5f;
        float c = Float.max(num1,num2);
        float d = Float.min(num1,num2);
        float e = Float.sum(num1,num2);
        System.out.println("maximum is :"+c);
        System.out.println("minimum is :"+d);
        System.out.println("sum is :"+e);

    }
}