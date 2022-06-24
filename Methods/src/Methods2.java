class Person {
    
    //instance variables
    String name;
    int age;
    
    //Classes can contain
    
    //1.Data
    //2.Subroutines(methods)
    
    //exemplos of methods bellow:
    
    void speak(){
        for (int i=0;i<3;i++){
            System.out.println("My name is "+name+" I am "+age+" years old.");
        }
    }
    
    void sayHello(){
        System.out.println("Hello there!!!");
    }
    
}
public class Methods2{
    public static void main(String[] args){
        
        Person person1 = new Person();
        person1.name = "Joe";
        person1.age = 34;
        person1.speak();
        person1.sayHello();
        
        Person person2 = new Person();
        person2.name = "Jef";
        person2.age = 24;
        person2.speak();
        person2.sayHello();
        
        System.out.println(person1.name);
        System.out.println(person2.name);
        
    
    }
    
}
    