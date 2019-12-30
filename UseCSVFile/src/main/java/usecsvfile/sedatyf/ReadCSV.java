package usecsvfile.sedatyf;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import com.opencsv.CSVReader;

public class ReadCSV {

	private CSVReader reader;
	private HashMap<String, Integer> columnIndices;
	private String[] currentLine;

	public ReadCSV(String filePath) throws IOException {
		// Build Reader Instance
		//// Read register.csv
		//// Default seperator is ;
		//// Default quote character is double quote
		//// Start reading from line number 0
		reader = new CSVReader(new FileReader(filePath), ',', '"', 0);

		// Read CSV first line, in my case, I want to read header
		String[] header = reader.readNext();

		columnIndices = new HashMap<String, Integer>();
		nextLine();

		// Store keys and values from the header
		//// header[i] will be our itemName
		for (int i = 0; i < header.length; i++) {
			columnIndices.put(header[i], i);
		}
	}
	
	public void nextLine() throws IOException {
		currentLine = reader.readNext();
	}

	public String getValue(String itemName) throws IOException {
		
		if(currentLine == null) {
			return null;
		} 
		
		// Return null if your itemName does not exist
		if(!columnIndices.containsKey(itemName)) {
			System.out.println("Votre élément n'existe pas");
			return null;
		}
		// Get index from header according to the specified itemName
		int pos = columnIndices.get(itemName);
		// Return the specific value according to the specified itemName and testCases
		return currentLine[pos];
	}

}
