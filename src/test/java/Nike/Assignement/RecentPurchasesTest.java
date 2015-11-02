package Nike.Assignement;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class RecentPurchasesTest {
	
	RecentPurchases rp = new RecentPurchases();
	 
	String filePath = rp.FilePath;
	
	
	
	@SuppressWarnings("unchecked")
	@Test
	public void verifyDateProductNumber01() throws JsonParseException, JsonMappingException, IOException {
		 
		String Date = "10/10/2015";
		String Order_Date = null;
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> ShoeDataFile = mapper
				.readValue(
						new File(
								//"/Users/cydobolctbnem/Documents/Resources/Recent Purchase Product ID # 01.json"),
								filePath + "Recent_Purchase_Product_ID_#_02_.json"),
						Map.class);

		Map Warehouse = (Map) ShoeDataFile
				.get("Warehouse");
		List ShoeSection = (List) Warehouse.get("Shoe section");
		for (Object users : ShoeSection)
		{
			String Brand = (String) ((Map) users).get("Brand");
 			Map usersMap = (Map) users;

			Map<String, Object> TypeMap = (Map) usersMap
					.get("Type");
			List SportsShoesList = (List) TypeMap
					.get("SportsShoes");
			for (Object SportsShoes : SportsShoesList)
			{
	 
				  Order_Date = (String) ((Map) SportsShoes)
						.get("Order_Date");
			 
	 
				
				
				 
 
		assertEquals(Date, Order_Date);

 
			}

		}

	
	 


	}

}
