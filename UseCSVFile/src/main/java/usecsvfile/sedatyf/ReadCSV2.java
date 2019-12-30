package usecsvfile.sedatyf;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadCSV2 {
	
	static CSVReader reader;
	
	public static CSVReader setReader(String filePath) {
		try {
		return reader = new CSVReader(new FileReader(filePath), ',', '"', 0);
		} catch (Exception e) {
			System.out.println("wrong file");
		}
		return null;
	}

	public static List<String[]> getDataColumn(CSVReader reader, int columnIndex) throws Exception {
		List<String[]> column = new ArrayList<String[]>();
		List<String[]> rows = reader.readAll();
		Integer rowIndex = 1;
		for (String[] row : rows) {
			String[] cols = new String[2];
			cols[0] = rowIndex.toString();
			cols[1] = row[columnIndex];
			column.add(cols);
			rowIndex++;
		}

		return column;
	}

	public static String getValue(CSVReader reader, String itemName) throws Exception {
		
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
