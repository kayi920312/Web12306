package com.ssm.web.province.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ssm.web.province.model.ProvinceInfo;
/**
 * 省份信息Dao
 * @author kaiying.chen
 *
 */
@Repository("provinceInfoDao")
public interface ProvinceInfoDao {
	
	//参数查询省份信息 
	List<ProvinceInfo> queryProvincesByParam(Map<String, Object> param); 
	//参数查询省份，包含其城市信息
	List<ProvinceInfo> queryProvincesWithCitiesByParam(Map<String, Object> param); 
}
