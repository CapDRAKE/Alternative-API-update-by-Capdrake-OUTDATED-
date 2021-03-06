package fr.trxyy.alternative.alternative_api;

public class ApiConstants {
	
	public static String API_VERSION = "1.3";
	public static String API_VERSION_TYPE = "BETA";
	public static String AUTHOR = "Capdrake";
	public static String[] HELPERS = {"Aucuns"};
	
	public static String getVersion() {
		return API_VERSION;
	}
	
	public static String getVersionType() {
		return API_VERSION_TYPE;
	}
	
	public static String getAuthor() {
		return AUTHOR;
	}
	
	public static String getHelpers() {
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < HELPERS.length; i++) {
	         sb.append(HELPERS[i] + " ");
	      }
		return sb.toString();
	}
	
}
