package methods;

public class TestMethodWithObjectAsParam {
    public void method1(Employee emp){
        System.out.println("I am in method called with Employee object");
        System.out.println("Employee Id: "+emp.empId + "\n"+ "Employee name: "+emp.empName);
    }

    public static void main(String[] args) {
        TestMethodWithObjectAsParam obj = new TestMethodWithObjectAsParam();
        Employee e = new Employee();
        obj.method1(e);
    }
}
