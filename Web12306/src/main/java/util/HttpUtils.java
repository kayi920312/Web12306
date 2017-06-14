package util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

/**
 * http工具类
 * 
 * @author kayi9
 *
 */
public class HttpUtils {

	/**
	 * 获取 HttpServletRequest
	 * 
	 * @return HttpServletRequest
	 */
	public static HttpServletRequest getHttpServletRequest() {
		return ServletActionContext.getRequest();
	}

	/**
	 * 获取 HttpServletResponse
	 * 
	 * @return HttpServletResponse
	 */
	public static HttpServletResponse getHttpServletResponse() {
		return ServletActionContext.getResponse();
	}

	/**
	 * http请求打印结果
	 * 
	 * @param result
	 */
	public static void printHttpServletResponse(Object obj) {
		PrintWriter prw = null;
		try {
			
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("application/json;charset=utf-8");
			response.setHeader("Access-Control-Allow-Origin", "*");
			response.setHeader("Access-Control-Allow-Credentials", "true");
			response.setHeader("Access-Control-Allow-Methods", "*");
			response.setHeader("Access-Control-Allow-Headers", "Content-Type,Access-Token");
			response.setHeader("Access-Control-Expose-Headers", "*");

			prw = response.getWriter();
			prw.print(obj);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != prw) {
				prw.close();
			}
		}
	}
}
