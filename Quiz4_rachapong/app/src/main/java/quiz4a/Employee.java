package quiz4a;

// (1.1) เขียน Java Docs
// คลาสนี้ใช้สำหรับเก็บข้อมูลพนักงาน
// บรรทัดที่10 รหัสพนักงาน
// บรรทัดที่11 ชื่อพนักงาน
// บรรทัดที่12 เงินเดือนพนักงาน
public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)
    // @param employeeId รหัสพนักงาน
    // @param name ชื่อของพนักงาน
    // @param salary เงินเดือนของพนักงาน (ถ้าเงินเดือนน้อยกว่าหรือเท่ากับ 0
    // จะถูกตั้งให้เป็น 0)
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    // (1.3)
    // @param เม็ดธอธคำนวนเงินเดือน
    // @return คืนค่าเงินเดือน
    public double calculateSalary() {
        return salary;
    }

    // (1.4)
    // @return คืนค่ารหัสพนักงาน
    // @param รหัสพนักงาน
    public int getEmployeeId() {
        return employeeId;
    }

    // (1.5)
    // @return คืนค่าชื่อพนักงาน
    // ชื่อพนักงาน
    public String getName() {
        return name;
    }
}