package com.hemebiotech.analytics;


import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

	public class AnalyticsCounter extends ReadSymptomDataFromFile implements IAnalyticsCounter{
	
	
		public AnalyticsCounter(String filepath) {
			super(filepath);
		}

		/**
		 * create ordered map an count by type of symptoms
		 * 
		 * @author julien.C
		 * @param String List
		 * @throws Exception 
		 */
		@Override 
		public Map<String, Integer> createMap(List<String> resultList) throws Exception{
		
			Map<String, Integer> map = new TreeMap<>();
			try {
				for (String stringUt : resultList) {
					if(!stringUt.isEmpty()) {
						if (map.containsKey(stringUt)) {
							 map.replace(stringUt,map.get(stringUt)+1 );
						 } else {
							 map.put(stringUt,1);
						 }	 
					} 
				 }
			} catch (Exception e) {
				throw new Exception ("Can not create map");
			}
		return map;
		
		}
		
		/**
		 * method for create a outpout file with symptom and number of symptom
		 * 
		 * @param map of symtoms and number symptoms
		 * @throws Exception 
		 */
		@Override 
		public void createResultFile(Map <String, Integer> map) throws Exception {
			
			FileWriter writer = new FileWriter ("result.out");
			try {	
				for (Map.Entry<String, Integer> entry : map.entrySet()) {
					writer.write(entry.getKey() +  "=" + entry.getValue() + "\n" );
					
				}
			} catch (IOException e) {
				throw new Exception("Can not insert data into the output file");
			
			} finally {
				writer.close();
			}
			
		}
}
