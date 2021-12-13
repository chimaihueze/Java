public class DoWhileLoop3 {
    public static void main(String []args)
    {
    int x = 49,y, sum =0;
    do
    {
    y= x%10;
    sum = sum+y;
    x = x/10;
    }while(x !=0);
    System.out.println("The factorial is: " +sum);
    }
    }