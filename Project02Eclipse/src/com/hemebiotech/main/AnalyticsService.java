package com.hemebiotech.main;

import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.AnalyticsCounter;
import com.hemebiotech.analytics.IAnalyticsCounter;

public class AnalyticsService {
	
	private static String filepath = "symptoms.txt";

		public static void main(String[] args) throws Exception {
		
			IAnalyticsCounter iAnalyticsCounter = new AnalyticsCounter(filepath); 
			
			// STEP 1 : read file and create list
			List<String> resultList = iAnalyticsCounter.getSymptoms();
			
						
			// STEP 2 create map for count symptom 
			Map<String, Integer> map = iAnalyticsCounter.createMap(resultList);
				
			// STEP 3 create file outpout 
			iAnalyticsCounter.createResultFile(map);
		}

}
