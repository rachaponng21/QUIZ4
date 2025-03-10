package quiz4a;

// 2.1
//  คลาส Manager เป็นคลาสที่สืบทอดมาจากคลาส Employee
public class Manager extends Employee {
    private String department; // แผนก
    private double bonus; // โบนัส

    // 2.2
    // สร้างผู้จัดใหม่ โดยจะมีการเพิ่ม employeeId, name, salary, , department ,
    // bonus
    // บรรทัดที่13 ใช้คอนสตรัคเตอร์ของ Employee
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3
    // แสดงรายละเอียดของผู้จัดการ
    // แสดงข้อมูลพื้นฐานทั้งหมดเกี่ยวกับผู้จัดการ
    public void displayDetails() {
        String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    // 2.4
    // แสดงรายละเอียดของผู้จัดการ โดยสามารถเลือกแสดงข้อมูลแบบเต็มหรือบางส่วนได้
    // เงื่อนไขที่ใช้ในการแสดงข้อมูล
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName(),
                    "Salary: " + calculateSalary(),
                    "Department: " + department,
                    "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                    "Employee ID: " + getEmployeeId(),
                    "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
