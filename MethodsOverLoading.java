package method.com;

public class MethodsOverLoading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {
    	MethodsOverLoading ob=new MethodsOverLoading();
    	
            ob.area(6,8);
            ob.area(8);  

}
}   
