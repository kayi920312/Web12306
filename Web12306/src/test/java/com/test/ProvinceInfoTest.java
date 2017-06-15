package com.test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.ssm.web.province.model.ProvinceInfo;
import com.ssm.web.province.service.ProvinceService;
import com.test.base.BaseDaoBeanSupport;

public class ProvinceInfoTest extends BaseDaoBeanSupport{


//	@Test
	public void queryProvincesByParam() {
		ProvinceService provinceService = (ProvinceService) getBean("provinceServiceImpl");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 1);
		List<ProvinceInfo> provinces = provinceService.queryProvincesByParam(param);
		System.out.println();
	}

	@Test
	public void queryProvincesWithCitiesByParam() {
		ProvinceService provinceService = (ProvinceService) getBean("provinceServiceImpl");
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", 19);
		System.out.println(new Date());
		List<ProvinceInfo> provinces = provinceService.queryProvincesWithCitiesByParam(param);
		System.out.println(new Date());
	}
}
