package com.ssm.web.province.service;

import java.util.List;
import java.util.Map;

import com.ssm.web.province.model.ProvinceInfo;
/**
 * 省份信息Service
 * @author kaiying.chen
 *
 */
public interface ProvinceService {
	
	//参数查询省份信息 
	List<ProvinceInfo> queryProvincesByParam(Map<String, Object> param); 
	//参数查询省份，包含其城市信息
	List<ProvinceInfo> queryProvincesWithCitiesByParam(Map<String, Object> param); 
}
