
public class Methods1 {
    public static void main(String[] args)
    {
        sayHello();
        sayHelloTo("Charlie");
        
        int x = returnFive();
        System.out.println(x);
        
        //f(x)= x*x;
        
        //here we have different ways to use a method, method inside a method
        int result = square(5);
        System.out.println(result);
        
        int resultx = square(x);
        System.out.println(resultx);
        
        int resultReturnFive = square(returnFive());
        System.out.println(resultReturnFive);
        
        int resultSquare = square(5);
        System.out.println(square(returnFive()));
    }
    
     
    
    
    
    //this method both returns a value, and takes in data
    static int square(int x){
        return x*x;
    }
    
    //this method returns int type with the value 5
    static int returnFive(){
        return 5;
    }
    //this method will say hello to name called on brackets
    static void sayHelloTo(String name){
        System.out.println("Hello "+name);
    }
    //this method just say hello
    static void sayHello(){
        System.out.println("Hello World");
        
              
    }
}
