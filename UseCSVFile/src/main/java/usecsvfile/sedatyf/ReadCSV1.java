package usecsvfile.sedatyf;

import java.io.FileReader;
import java.util.Arrays;

import com.opencsv.CSVReader;

public class ReadCSV1 {

	public static String getValue(String filePath, String itemName) throws Exception {
		// Build Reader Instance
		//// Read register.csv
		//// Default seperator is ;
		//// Default quote character is double quote
		//// Start reading from line number 0
		CSVReader reader = new CSVReader(new FileReader(filePath), ',', '"', 0);

		// Read CSV first line, in my case, I want to read header
		String[] nextCol = reader.readNext();

		// Get index of the matching header string
		int pos = Arrays.asList(nextCol).indexOf(itemName);
		
		// Read CSV line by line 
		while ((nextCol = reader.readNext()) != null) {
			
			//If index != -1 return values from matching columns
			if (pos != -1) {
				return nextCol[pos];
			}
		}
		return null;
	}
	
}
