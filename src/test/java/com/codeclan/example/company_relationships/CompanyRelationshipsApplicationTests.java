package com.codeclan.example.company_relationships;

import com.codeclan.example.company_relationships.models.Department;
import com.codeclan.example.company_relationships.models.Employee;
import com.codeclan.example.company_relationships.repositories.DepartmentRepository;
import com.codeclan.example.company_relationships.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@AutoConfigureTestDatabase
@RunWith(SpringRunner.class)
@SpringBootTest
class CompanyRelationshipsApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {

	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Finance");
		departmentRepository.save(department);

		Employee employee = new Employee("Yana", "Zykova", 123, department);
		employeeRepository.save(employee);
	}

}
