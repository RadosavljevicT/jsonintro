package main;

import java.io.FileReader;
import java.util.Map.Entry;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Main6 {

	public static void main(String[] args) {
		
		try (FileReader file = new FileReader("movie_manual.json")){
			
			Gson gson = new Gson();
			JsonObject m = gson.fromJson(file, JsonObject.class);
			
			System.out.println(m.get("imdbID").getAsString());
			System.out.println(m.get("title").getAsString());
			System.out.println(m.get("releaseYear").getAsInt());
			
			double rating = m.get("rating").getAsDouble() - 1;
			System.out.println(rating);
			
			JsonArray actors = m.getAsJsonArray("actors");
			System.out.println(actors.get(1).getAsString());
			
			Set <Entry<String, JsonElement>> es = m.entrySet();
			
			for(Entry <String, JsonElement> element : es)
				System.out.println(element);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
