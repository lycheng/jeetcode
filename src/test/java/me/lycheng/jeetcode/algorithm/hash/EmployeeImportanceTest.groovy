package me.lycheng.jeetcode.algorithm.hash

class EmployeeImportanceTest extends GroovyTestCase {
    void testGetImportance() {
        def solution = new EmployeeImportance()
        def employee1 = new EmployeeImportance.Employee()
        employee1.id = 1
        employee1.importance = 5
        employee1.subordinates = [2, 3]

        def employee2 = new EmployeeImportance.Employee()
        employee2.id = 2
        employee2.importance = 3

        def employee3 = new EmployeeImportance.Employee()
        employee3.id = 3
        employee3.importance = 3

        def employees = Arrays.asList(employee1, employee2, employee3)
        assertEquals(11, solution.getImportance(employees, 1))
    }
}
