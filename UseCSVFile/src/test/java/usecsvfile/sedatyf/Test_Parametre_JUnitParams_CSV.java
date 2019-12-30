package usecsvfile.sedatyf;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;

@RunWith(JUnitParamsRunner.class)
public class Test_Parametre_JUnitParams_CSV {
	
	private static ReadCSV reader;
	
	@BeforeClass
	// BeforeClass here is mandatory because if you don't have BeforeClass you will instantiate several reader and you will have only the
	// first line of your map
	public static void initialize() {
		try {
			reader = new ReadCSV("src/test/resources/test.csv");
		} catch (Exception e) {
			System.out.println("Fichier introuvable : " + e);
		}
	}

	@Test
	// You need to precise mapper = CsvWithHeaderMapper to only get values and not header's values
	@FileParameters(value = "src/test/resources/test.csv", mapper = CsvWithHeaderMapper.class)
	public void test(int ID, String paramFirstname, String paramLastname) throws Exception {
		System.out.println(reader.getValue("firstname"));
	}

}
