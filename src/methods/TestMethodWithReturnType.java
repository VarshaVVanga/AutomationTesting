package methods;

public class TestMethodWithReturnType {
    public int methodInt(int value){
        System.out.println("In method that returns int value");
        return value;
    }
    public String methodString(){
        System.out.println("In method that returns string value");
        return "abc";
    }
    public float methodFloat(){
        System.out.println("In method that returns float value");
        return 20.0f;                   //default floatint point value is considered as double, therefore typecasting to float is necessary
    }

    public static void main(String[] args) {
        TestMethodWithReturnType obj = new TestMethodWithReturnType();
        int val = 100;
        int a = obj.methodInt(val);
        System.out.println(obj.methodInt(val));
        System.out.println(obj.methodString());
        System.out.println(obj.methodFloat());
    }
}
