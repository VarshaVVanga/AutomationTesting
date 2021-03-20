package methods;

public class TestMethodWithObjectAsReturnType {
    public Employee method1(Employee e){
        System.out.println("In method that returns object Employee");
        e.empName = "Varsha Vanga";
        System.out.println("Employee name: "+e.empName + " Employee id: "+e.empId);
        return e;
    }

    public TestMethodWithObjectAsReturnType method2(){
        TestMethodWithObjectAsReturnType t = new TestMethodWithObjectAsReturnType();    //return type is same class in which the method is declared
        return t;
    }

    public static void main(String[] args) {
        TestMethodWithObjectAsReturnType obj = new TestMethodWithObjectAsReturnType();
        Employee e = new Employee();
        Employee ee = obj.method1(e);
        System.out.println(ee);

        TestMethodWithObjectAsReturnType t2 = obj.method2();
        System.out.println(t2);
    }
}
