package com.ssm.web.city.dao;

import org.springframework.stereotype.Repository;

import com.ssm.web.city.model.CityInfo;
/**
 * 城市信息Dao
 * @author kayi9
 *
 */
@Repository("cityInfoDao")
public interface CityInfoDao {
	
	//根据id查询城市信息
	CityInfo queryCityById(Integer id);
	
}
