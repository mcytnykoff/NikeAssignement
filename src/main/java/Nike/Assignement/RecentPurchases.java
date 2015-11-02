package Nike.Assignement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class RecentPurchases {
	
	static String FilePath = "/Users/cydobolctbnem/Documents/Development/Assignement/src/main/resources/";
	static String date = "10/10/2015";
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JsonProcessingException,
			IOException
	{
		//FilePath = args[0];
		
		
		
		DataGeneratorForShoeWareHouse Data = new DataGeneratorForShoeWareHouse();
		
		
		Data.DataGeneratorForSHoeWareHouse();
		
		RecentPurchases rp = new RecentPurchases();
		 
		String filePath = rp.FilePath;
		String text_case_id = "TC-001.";
		int i = 0;
		
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> ShoeDataFile = mapper
				.readValue(
						new File(
								filePath + "DataForShoeWareHouse.json"),
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
				String ID = (String) ((Map) SportsShoes)
						.get("ID");
				String Product_ID = (String) ((Map) SportsShoes)
						.get("Product_ID");
				String Order_Date = (String) ((Map) SportsShoes)
						.get("Order_Date");
				String Order_Quantity = (String) ((Map) SportsShoes)
						.get("Order_Quantity");
	 
				
		 
				FileWriter writer = null;
			    try {
			        writer = new FileWriter(filePath + "Recent_Purchase_Product_ID_#_" + ID + "_.json");
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }
			    JsonGenerator gen = Json.createGenerator(writer);

			    gen.writeStartObject()
			    .writeStartObject("Warehouse")
			        .writeStartArray("Shoe section")
			          .writeStartObject().write("Brand", Brand)
			          .writeStartObject("Type")
			             .writeStartArray("SportsShoes")
			                .writeStartObject().write("ID",  ID).write("Product_ID", Product_ID).write("Order_Date", Order_Date).write("Order_Quantity", Order_Quantity)
			                
			                .writeEnd()
			                .writeEnd()
			            .writeEnd()
			          .writeEnd()
			            .writeEnd()
			          .writeEnd()
			       
			    .writeEnd();
			    gen.close();
			    
			   
			    
 				
			     
			 
				if (date.equals(Order_Date)) {
					System.out.println("Test Case ID: \t\t" + text_case_id + i++);
					System.out.println("Product ID: \t\t" + ID);
					System.out.println("Title Expected: \t" + date);
					System.out.println("Title Actual: \t\t" + Order_Date);
					System.out.println("Test Case Result: \t" + "PASSED" + "\n\n");
				} else {
					System.out.println("Test Case ID: \t\t" + text_case_id + i++);
					System.out.println("Product ID: \t\t" + ID);
					System.out.println("Title Expected: \t" + date);
					System.out.println("Title Actual: \t\t" + Order_Date);
					System.out.println("Test Case Result: \t" + "FAILED"+ "\n\n");
				}
 
			}

		}

	}





	}



 

 
