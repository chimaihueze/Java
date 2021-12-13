public class ForLoop3{
    public static void main(String []args)
    {
    int x = 49,y, addition =0;
    for (x = 49; x!=0 ; x = x/10 )
    {
    y= x%10;
    addition = addition+y;
    }
    System.out.println("The factorial is: " +addition);
    }
    }