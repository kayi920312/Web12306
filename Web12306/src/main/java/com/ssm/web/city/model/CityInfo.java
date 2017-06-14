package com.ssm.web.city.model;

import java.io.Serializable;

//@Alias("cityInfo")
public class CityInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;				//主键
	private String cityid;			//市标志
	private String city;			//市名称
	private String father;			//省份标识
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCityid() {
		return cityid;
	}
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
