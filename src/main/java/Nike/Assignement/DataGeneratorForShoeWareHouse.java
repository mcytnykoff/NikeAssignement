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

public class DataGeneratorForShoeWareHouse {
	RecentPurchases rp = new RecentPurchases();
	 
	String filePath = rp.FilePath;

	@SuppressWarnings("unchecked")
	public   void DataGeneratorForSHoeWareHouse()
	{

	 
 
				
				FileWriter writer = null;
			    try {
			        writer = new FileWriter(filePath + "DataForShoeWareHouse.json");
			    } catch (IOException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }
			    JsonGenerator gen = Json.createGenerator(writer);

			    gen.writeStartObject()
			    .writeStartObject("Warehouse")
			        .writeStartArray("Shoe section")
			          .writeStartObject().write("Brand", "Nike")
			          .writeStartObject("Type")
			             .writeStartArray("SportsShoes")
			                .writeStartObject().write("ID", "01").write("Product_ID", "16628012").write("Order_Date", "09/09/2015").write("Order_Quantity", "3")
			                .writeEnd()
			                .writeStartObject().write("ID", "02").write("Product_ID", "26628012").write("Order_Date", "10/02/2015").write("Order_Quantity", "2")
			                .writeEnd()
			                .writeStartObject().write("ID", "01").write("Product_ID", "16628012").write("Order_Date", "10/09/2015").write("Order_Quantity", "1")
			                .writeEnd()
			                .writeStartObject().write("ID", "02").write("Product_ID", "26628012").write("Order_Date", "10/10/2015").write("Order_Quantity", "2")
			                .writeEnd()
			                .writeStartObject().write("ID", "03").write("Product_ID", "56628012").write("Order_Date", "7/09/2015").write("Order_Quantity", "3")
			                .writeEnd()
			                .writeStartObject().write("ID", "04").write("Product_ID", "86628012").write("Order_Date", "6/09/2015").write("Order_Quantity", "4")
			                .writeEnd()
			                .writeStartObject().write("ID", "03").write("Product_ID", "56628012").write("Order_Date", "8/09/2015").write("Order_Quantity", "5")
			                .writeEnd()
			                .writeStartObject().write("ID", "04").write("Product_ID", "86628012").write("Order_Date", "7/02/2015").write("Order_Quantity", "6")
			                .writeEnd().writeEnd()
			            .writeEnd()
			       
			            
			          .writeEnd() .writeEnd()
			          .writeEnd()
			       
			    .writeEnd();
			    gen.close();

		 
				
				
				 

			}

		}









	
	

