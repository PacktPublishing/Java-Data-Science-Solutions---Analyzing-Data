import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

public class TestTsv {
	public void parseTsv(String fileName){
		TsvParserSettings settings = new TsvParserSettings();
	    settings.getFormat().setLineSeparator("\n");
		    TsvParser parser = new TsvParser(settings);
	    List<String[]> allRows = parser.parseAll(new File(fileName));
	    for (int i = 0; i < allRows.size(); i++){
	    	System.out.println(Arrays.asList(allRows.get(i)));
	    }
	}
	public static void main(String[] args){
		TestTsv test = new TestTsv();
		 test.parseTsv("C:/testCSV.csv");
		 }
}

Year Make Model Description Price
1997 Ford E350 ac, abs, moon 3000.00
1999 Chevy Venture "Extended Edition" 4900.00
1996 Jeep Grand Cherokee MUST SELL!nair, moon roof, loaded 4799.00
1999 Chevy Venture "Extended Edition, Very Large" 5000.00
 Venture "Extended Edition" 4900.00