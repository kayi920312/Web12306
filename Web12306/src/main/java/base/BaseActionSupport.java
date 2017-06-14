package base;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class BaseActionSupport extends ActionSupport implements RequestAware, SessionAware, ApplicationAware, ModelDriven<Object>{

	private static final long serialVersionUID = 1L;

	private Object model;
	private Map<String,Object> request;
	private Map<String,Object> session;
	private Map<String,Object> application;
	
	public Object getModel() {
		return model;
	}

	public void setApplication(Map<String, Object> arg0) {
		this.request = arg0;
	}

	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	public void setRequest(Map<String, Object> arg0) {
		this.application = arg0;
	}

	public Map<String, Object> getRequest() {
		return request;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Map<String, Object> getApplication() {
		return application;
	}

	public void setModel(Object model) {
		this.model = model;
	}

}
