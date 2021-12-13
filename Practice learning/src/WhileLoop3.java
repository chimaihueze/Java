public class WhileLoop3{
    public static void main(String []args)
    {
    int x = 49,y, addition =0;
    while(x !=0)
    {
    y= x%10;
    
    addition += y;
    x = x/10;
    }
    System.out.println("The factorial is: " +addition);
    }
    }