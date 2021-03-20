package methods;

public class TestMethodWithoutParameter {
//Methods without parameters
    public void test1() {
        System.out.println("I am in test1");
    }
    public void test2() {
        System.out.println("I am in test2");
    }
    public static void test3() {
        System.out.println("I am in test3");
    }
    public static void main(String[] args){
        TestMethodWithoutParameter obj = new TestMethodWithoutParameter();
        obj.test1();                        //local method call
        obj.test2();                        //local method call
        test3();                            //static method call
        TestMethodWithoutParameter.test3(); //static method call
    }

}
