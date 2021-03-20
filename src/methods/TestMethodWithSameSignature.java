package methods;

public class TestMethodWithSameSignature {
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(String s1, String s2){
        System.out.println(s1+s2);
    }

    public static void main(String[] args) {
        TestMethodWithSameSignature obj = new TestMethodWithSameSignature();
        obj.add(10,20);
        obj.add("10","20");
    }
}
