package usecsvfile.sedatyf;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import com.opencsv.CSVReader;

@RunWith(Parameterized.class)
public class Test_Parametre_Parameterized_CSV {

	static CSVReader reader = ReadCSV2.setReader("src/test/resources/test.csv");

	String testCaseIndex;
	String testCaseID;

	public void setReader() throws Exception {
		ReadCSV2.setReader("src/test/resources/test.csv");
	}

	@Parameters(name = "{0}")
	public static List<String[]> getData() throws Exception {
		return ReadCSV2.getDataColumn(reader, 0);
	}

	public Test_Parametre_Parameterized_CSV(String testCaseIndex, String testCaseID) {
		this.testCaseIndex = testCaseIndex;
		this.testCaseID = testCaseID;
	}

	@Test
	public void my_test() throws Exception {
		System.out.println(ReadCSV2.getValue(reader, "firstname"));
	}

}
