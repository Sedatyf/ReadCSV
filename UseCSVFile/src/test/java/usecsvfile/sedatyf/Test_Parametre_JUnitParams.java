package usecsvfile.sedatyf;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class) // Call JUnitParamsRunner instead of the classic Runner
public class Test_Parametre_JUnitParams {

	@Test
	// Define parameters here
	@Parameters({ "17, false", "22, true" })
	// Test value
	public void personIsAdult(int age, boolean valid) throws Exception {
		assertEquals(new Person(age).isAdult(), valid);
	}

	/*------------------------------------------------*/

	// If you want to have more parameters, it's more convenient to use a method for
	// parameters

	@Test
	// Parameters are defined in the methode "adultValues"
	@Parameters(method = "adultValues")
	public void personIsAdult2(int age, boolean valid) throws Exception {
		assertEquals(valid, new Person(age).isAdult());
	}

	private Object[] adultValues() {
		return new Object[] { 
				new Object[] { 13, false }, 
				new Object[] { 17, false }, 
				new Object[] { 18, true },
				new Object[] { 22, true }, 
		};
	}

}
