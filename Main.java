import java.util.*;
class Test {
    static int i;
    int j;
    static {
        i = 10;
        System.out.println("Static block called ");
    }
    Test(){
        System.out.println("Constructor called");
    }
}
 
class Main {
    public static void main(String[] x) {
 
      
       Test t1 = new Test();
    }
}