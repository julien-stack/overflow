package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface IAnalyticsCounter {
	
	
	
	
	
	/**
	 * Method for create a list of string from input file
	 * 
	 * @param resultList
	 * @return Map<String,Integer>
	 * @throws Exception 
	 */
	List<String> getSymptoms () throws Exception;
	/**
	 * Method for create a map from a list of string value.
	 * 
	 * @param resultList
	 * @return Map<String,Integer>
	 * @throws Exception 
	 */
	Map<String, Integer> createMap(List<String> resultList) throws Exception;

	
	/**
	 * Method for create a output file with symptom list ordered and grouped. 
	 * 
	 * @param map 
	 * @return map of symptoms and number symptoms
	 * @throws Exception ,IOException 
	 */
	void createResultFile(Map<String, Integer> map) throws IOException, Exception;

	
	
	

}
