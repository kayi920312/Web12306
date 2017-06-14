package util;

import com.google.gson.Gson;

/**
 * 封装gson工具
 * @author kayi9
 *
 */
public class GsonUtil {
	
	private final static Gson gson = new Gson();
	
	/**
	 * Object to JSON
	 * @param obj
	 * @return
	 */
	public final static String toJson(Object obj){
		return gson.toJson(obj);
	}
	
	/*public final static Object toBean(String json, ){
		return gson.fromJson(json, typeOfT)
	}*/
}
