package usecsvfile.sedatyf;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(Parameterized.class)
public class Test_Parametre_Calculator {

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0, 0 }, { 1, 1, 2 } });
	}

	private Calculator calculator;
	private int first;
	private int second;
	private int expectedSum;

	public Test_Parametre_Calculator(int first, int second, int expectedSum) {
		this.calculator = new Calculator();
		this.first = first;
		this.second = second;
		this.expectedSum = expectedSum;
	}
	
	@Test
    public void shouldReturnCorrectSum() {
        int actualSum = calculator.sum(first, second);
        assertEquals(expectedSum, actualSum);
    }

}
