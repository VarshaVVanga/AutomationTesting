package methods;

public class MethodChaining {
    public void method1(){
        method2();
        System.out.println("I am in method 1");
    }
    public void method2(){
        method3();
        System.out.println("I am in method 2");
    }
    public void method3(){
        System.out.println("I am in method 3");
    }

    public static void main(String[] args) {
        MethodChaining m = new MethodChaining();
        m.method1();
    }
}
