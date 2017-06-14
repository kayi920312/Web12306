package com.ssm.web.city.service;

import com.ssm.web.city.model.CityInfo;
/**
 * 城市信息Service
 * @author kayi9
 *
 */
public interface CityInfoService {

	//根据id查询城市信息
	CityInfo queryCityById(Integer id);
}
