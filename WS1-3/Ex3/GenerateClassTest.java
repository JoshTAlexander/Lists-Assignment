import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GenerateClassTest {
	
	private GenerateClass person;


	@BeforeEach
	public void init() {
		String classname = "Person";
		String[] variableNames = { "name", "dob" };
		String[] variableTypes = { "String", "Date" };
		person = new GenerateClass(classname, variableNames, variableTypes);

}
	
	@Test
	public void test1() {
		String expectedFields = "  private String name;\n" + "  private Date dob;\n\n";
		String actualFields = person.makeFields();
		assertEquals(expectedFields, actualFields);
		
}
	@Test
	public void test3() {
		String expectedGetters = "  public String getName(){\n" + "    return name;\n" + "  }\n"
				+ "  public Date getDob(){\n" + "    return dob;\n" + "  }\n";
		String actualGetters = person.makeGetters();
		assertEquals(expectedGetters, actualGetters);
	}
	
	@Test
	public void test4() {
		String expectedSetters = "  public void setName(String name){\n" + "    this.name = name;\n" + "  }\n"
				+ "  public void setDob(Date dob){\n" + "    this.dob = dob;\n" + "  }\n";
		String actualSetters = person.makeSetters();
		assertEquals(expectedSetters, actualSetters);
	}

	
	
	
	
}
