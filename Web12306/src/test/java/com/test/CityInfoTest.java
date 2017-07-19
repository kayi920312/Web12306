package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ssm.web.city.model.CityInfo;
import com.ssm.web.city.service.CityInfoService;
import com.test.base.BaseDaoBeanSupport;

public class CityInfoTest extends BaseDaoBeanSupport{


//	@Test
	public void queryCitiesByParam() {
		CityInfoService cityInfoService = (CityInfoService) getBean("cityInfoServiceImpl");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 1);
		List<CityInfo> cities = cityInfoService.queryCitiesByParam(param);
		System.out.println(cities.toString());
	}

	@Test
	public void queryCitiesWithProvinceByParam() {
		CityInfoService cityInfoService = (CityInfoService) getBean("cityInfoServiceImpl");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 11);
		List<CityInfo> cities = cityInfoService.queryCitiesWithProvinceByParam(param);
		System.out.println(cities.size());
	}
	
}
