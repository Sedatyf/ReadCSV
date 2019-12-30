package usecsvfile.sedatyf;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class Test_Parametre_JUnitParams_CSV {

	@Test
	@FileParameters(value = "src/test/resources/test.csv", mapper = CsvWithHeaderMapper.class)
	public void test(int ID, String paramFirstname, String paramLastname) throws Exception {
		System.out.println(ReadCSV1.getValue("src/test/resources/test.csv", "firstname"));
	}

}
