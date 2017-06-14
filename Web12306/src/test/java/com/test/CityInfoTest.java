package com.test;

import org.junit.Test;

import com.ssm.web.city.model.CityInfo;
import com.ssm.web.city.service.CityInfoService;
import com.test.base.BaseDaoBeanSupport;

public class CityInfoTest extends BaseDaoBeanSupport{


	@Test
	public void test() {
		CityInfoService cityInfoService = (CityInfoService) getBean("cityInfoServiceImpl");
		CityInfo city = cityInfoService.queryCityById(1);
		System.out.println(city.getId());
	}

}
