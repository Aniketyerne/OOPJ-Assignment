//int value into String
//int value into Integer instance.
//String instance into Integer instance.
//int value into binary, octal and hexadecimal string.


class Bytess{
    public static void main(String args[])
    {
        int a = 4;
        String str = String.valueOf(a);
        int b = new Integer(a);
        String str1 = "124";
        String str2 = new String(str1);
        int c = new Integer(str2);
        System.out.println(str);  //int value into String
        System.out.println(b);   //int value into Integer instance.
        System.out.println(str2);  //String instance into Integer instance.


    }
}