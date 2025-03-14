/*
 * This source file was generated by the Gradle 'init' task
 */
package quiz4a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    // ตัวอย่าง 1 ให้สร้าง Employee Employee(1, "John Doe", 50000)
    // และตรวจสอบว่าเงินเดือน เป็น 50000
    @Test
    void createEmployee() {
        Employee employee = new Employee(1, "John Doe", 50000);
        assertEquals(50000, employee.calculateSalary(), "เงินเดือนต้องเป็น 50000");
    }

    // ข้อ 2 ตรวจสอบว่า Salary ตั้งให้ติดลบไม่ได้
    @Test
    void SalaryCannotBeNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Employee(1, "John Doe", -50000);
        });
        assertEquals("เงินเดือนไม่สามารถเป็นค่าลบได้", exception.getMessage(),
                "เมื่อเงินเดือนเป็นค่าลบ ต้องโยน IllegalArgumentException");
    }

    // ข้อ 3 ตรวจสอบว่า Bonus เป็น 20% ของ เงินเดือน(Salary)
    @Test
    void getbonus20() {
        Manager manager = new Manager(1, "Jane Smith", 50000, "IT", 0);
        double expectedBonus = 50000 * 0.2; // 50000 * 20%
        assertEquals(expectedBonus, manager.getEmployeeId(), "โบนัสต้องเป็น 20% ของเงินเดือน");
    }
}