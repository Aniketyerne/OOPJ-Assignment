import java.util.Scanner;

class Program{
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        char ch = args[0].charAt(0);
        if(Character.isLetter(ch))
        {
            System.out.println(ch+" is a character");
            if(Character.isLowerCase(ch))
            {
                char s = Character.toUpperCase(ch);
                int codepoint = ch;
                System.out.println("To uppercase :"+s);
                System.out.println("codepoint :"+codepoint);
            }
            else{
                char s = Character.toLowerCase(ch);
                int codepoint = ch;
                System.out.println("To lowercase :"+s);
                System.out.println("codepoint :"+codepoint);
            }
        }
        else if(Character.isDigit(ch))
        {
            System.out.println(ch+" is integer");
            int codepoint = ch;
            System.out.println("codepoint :"+codepoint);
        }
    }
}