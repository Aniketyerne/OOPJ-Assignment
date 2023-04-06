//Write a program to convert state of Integer instance into byte, short, int, long, float and double.

class Bytess{
    public static void main(String args[])
    {
        int a = 0;
        int b = new Integer(a);
        byte c = Byte.valueOf(b);
        short d = Short.valueOf(b);
        int e = Integer.valueOf(b);
        long f = Long.valueOf(b);
        float g = Float.valueOf(b);
        double h = Double.valueOf(b);
        System.out.println(c);  //byte
        System.out.println(d);   //short
        System.out.println(e); //Int
        System.out.println(f); //long
        System.out.println(g); //float
        System.out.println(h); //double

    }
}