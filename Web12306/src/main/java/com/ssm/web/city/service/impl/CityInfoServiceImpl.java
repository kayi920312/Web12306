package com.ssm.web.city.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.web.city.dao.CityInfoDao;
import com.ssm.web.city.model.CityInfo;
import com.ssm.web.city.service.CityInfoService;

@Service("cityInfoServiceImpl")
public class CityInfoServiceImpl implements CityInfoService {

	@Resource(name="cityInfoDao")
	private CityInfoDao cityInfoDao;
	
	public CityInfo queryCityById(Integer id) {
		return cityInfoDao.queryCityById(id);
	}

}
