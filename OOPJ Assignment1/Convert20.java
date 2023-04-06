 //long value into String
 //long value into Long instance.
 //String instance into Long instance.
 //long value into binary, octal and hexadecimal string.

class Bytess{
    public static void main(String args[])
    {
        long a = 1010;
        String str = String.valueOf(a);
        long b = new Long(a);
        String str2 = "78554879";
        String str1 = new String(str2);
        byte c = new Byte(str1);
        System.out.println(str);
        System.out.println(b);
        System.out.println(c);

    }
}

class Bytes{
    public static void main(String args[])
    {
        String str = "false";
        Boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }
}