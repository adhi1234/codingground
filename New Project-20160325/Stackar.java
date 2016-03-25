import java.io.*;
class StackX
{
    private int maxsize=5;
    private double[]StackArray;
    private int top;
public StackX(int s)
{
    maxsize=5;
    StackArray=new double[maxsize];
top=-1;
}

public void push(double p)
{
    StackArray[++top]=p;
}
public double pop()
{
    return StackArray[top--];
}
 public boolean isEmpty()
 {
     return (top==1);
 }
 
public boolean isFull()
{
    return(top==maxsize-1);
}



}


 class Stackar
{
    public static void main(String args[])throws IOException
    {
        
    StackX stc=new StackX(10);
        stc.push(20);
        stc.push(30);
        stc.push(40);
        stc.push(50);
        while(!stc.isEmpty())
{
double value=stc.pop();
System.out.println(value);
}
    
}
}
    
 
   

