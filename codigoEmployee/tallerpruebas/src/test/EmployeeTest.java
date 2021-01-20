package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Employee;
import main.EmployeeType;

class EmployeeTest {

	@Test
	void testUSDWorker() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Worker);
		assertEquals(264.3333435058594, empleado.cs());
	}
	
	@Test
	void testOtherWorker() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Worker);
		assertEquals(254.33334350585938, empleado.cs());
	}
	
	@Test
	void testUSDSupervisor() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Supervisor);
		assertEquals(271.3333435058594, empleado.cs());
	}
	
	@Test
	void testOtherSupervisor() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Supervisor);
		assertEquals(261.33334350585938, empleado.cs());
	}
	
	@Test
	void testUSDManager() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Manager);
		assertEquals(278.3333435058594, empleado.cs());
	}
	
	@Test
	void testOtherManager() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Manager);
		assertEquals(268.33334350585938, empleado.cs());
	}
	
	@Test
	void testYearUSDWorker() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Worker);
		assertEquals(386,empleado.CalculateYearBonus());
	}
	
	@Test
	void testYearOtherWorker() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Worker);
		assertEquals(386,empleado.CalculateYearBonus());
	}
	
	@Test
	void testYearUSDSupervisor() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Supervisor);
		assertEquals(393,empleado.CalculateYearBonus());
	}
	
	@Test
	void testYearOtherSupervisor() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Supervisor);
		assertEquals(383,empleado.CalculateYearBonus());
	}
	
	@Test
	void testYearUSDManager() {
		Employee empleado = new Employee(200, "USD",20, EmployeeType.Manager);
		assertEquals(586,empleado.CalculateYearBonus());
	}
	
	@Test
	void testYearOtherManager() {
		Employee empleado = new Employee(200, "Dolar",20, EmployeeType.Manager);
		assertEquals(576,empleado.CalculateYearBonus());
	}
}
