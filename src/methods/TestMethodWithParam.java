package methods;

public class TestMethodWithParam {
    //Methods with parameters

    public void testAdd(int a, int b) {
        System.out.println("Addition of a & b is: " + (a+b));
    }
    public void testAddString(int a, String str) {              //here variables a & str are local variables
        System.out.println("Addition of a & str is " + (a + str));
    }
    public static void testStaticMethod(String firstName, String lastName) {
        System.out.println("My full name is " + firstName + " " + lastName);
    }
    public static void main(String[] args){
        TestMethodWithParam obj = new TestMethodWithParam();
        obj.testAdd(10,20);
        obj.testAddString(1, "Varsha");
        TestMethodWithParam.testStaticMethod("Varsha","Vanga");
    }
}
