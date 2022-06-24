
public class Methods4 {

    public static void main(String[] args) {
        Methods4 obj = new Methods4();
        obj.methodOne();

    }

    public void methodOne() {
        int x = 10;
        methodTwo(x);
        
        System.out.println("x = " + x);
    }

    public void methodTwo(int x) {
        x = 20;
      
    }
}

