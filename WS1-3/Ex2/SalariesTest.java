import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalariesTest {
	
	public static final double TOLERANCE = 0.0000001;
	private Salaries salaries;


	@BeforeEach
	public void init() {
		salaries = new Salaries();
		double[] ben = { 100, 1000, 3000, 4000, 2000, 0, 0, 0, 0, 0, 0, 0 };
		double[] sam = {1000, 1000, 0, 2000, 1250, 2100, 1250, 1400, 1600, 2500, 1000, 0 };

		salaries.add(ben);
		salaries.add(sam);
	
	}
	
	@Test
	public void test1() {
		double[] benSalary = { 100, 1000, 3000, 4000, 2000, 0, 0, 0, 0, 0, 0, 0 };
		double expectedAverage = 2020;
		double actualAverage = Salaries.average(benSalary);
		assertEquals(expectedAverage, actualAverage, TOLERANCE);

}
	
	@Test
	public void test2() {
		double[] samSalary = {1000, 1000, 0, 2000, 1250, 2100, 1250, 1400, 1600, 2500, 1000, 0 };
		double expectedAverage = 1510;
		double actualAverage = Salaries.average(samSalary);
		assertEquals(expectedAverage, actualAverage, TOLERANCE);

}
	@Test
	public void test3() {
		double[] Salary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		assertThrows(IllegalArgumentException.class, () -> {
			Salaries.average(Salary);
		});
	}
	
	@Test
	public void test4() {

		ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
		expectedAverageSalaries.add(2020.);
		expectedAverageSalaries.add(1510.);
	ArrayList<Double> actualAverageSalaries = salaries.averageSalaries();

		for (int i = 0; i < actualAverageSalaries.size(); i++) {
			assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i), TOLERANCE);
		}
	}
	
	@Test
	public void test5() {
		double[] noSalary = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] JoshSalary = { 200, 12, 345, 2015, 1246, 1506, 0, 0, 0, 0, 0, 0 };
		salaries.add(noSalary);
		salaries.add(JoshSalary);
		assertTrue(salaries.not3TimesHigher());
		
		
	
}
}