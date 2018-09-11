import java.util.*;
class Complex
{
    private int real, imag;
    
    public void setVals(int r, int i)
    {
        real = r;
        imag = i;
    }
    
    public void Display()
    {
        System.out.println("" + real + "+" + imag +"i");
    }
}
 class Complex1
{
    public static void main(String[] x)
    {
        Complex obj = new Complex();
        obj.setVals(2,5);
        obj.Display();
    }
} 