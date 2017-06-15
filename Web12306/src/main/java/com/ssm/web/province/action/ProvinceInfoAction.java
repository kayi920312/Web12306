package com.ssm.web.province.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import com.ssm.web.province.model.ProvinceInfo;
import com.ssm.web.province.service.ProvinceInfoService;

import util.EmptyUtils;
import util.GsonUtil;
import util.HttpUtils;

/**
 * 省份信息Action
 * @author kaiying.chen
 *
 */
@Controller("provinceInfoAction")
public class ProvinceInfoAction {
	
	@Resource(name="provinceInfoServiceImpl")
	private ProvinceInfoService provinceInfoService;
	
	/**
	 * 参数查询省份信息
	 */
	public void queryProvincesByParam(){
		HttpServletRequest request = HttpUtils.getHttpServletRequest();
		String id = request.getParameter("id");
		Map<String, Object> result = new HashMap<String, Object>();
		if(EmptyUtils.isEmpty(id)){
			result.put("result_code", "1");
			result.put("result_msg", "参数不匹配");
			HttpUtils.printHttpServletResponse(GsonUtil.toJson(result));
			return;
		}
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		
		List<ProvinceInfo> provinces = provinceInfoService.queryProvincesByParam(param);
		if(provinces!=null&&provinces.size()>0){
			result.put("result_code", "0");
			result.put("result_msg", "查询成功");
			result.put("provinces", provinces);
		}else{
			result.put("result_code", "1");
			result.put("result_msg", "没有找到数据");
		}
		HttpUtils.printHttpServletResponse(GsonUtil.toJson(result));
		return;
	}
	
	/**
	 * 参数查询省份，包含其城市信息
	 */
	public void queryProvincesWithCitiesByParam(){
		HttpServletRequest request = HttpUtils.getHttpServletRequest();
		String id = request.getParameter("id");
		Map<String, Object> result = new HashMap<String, Object>();
		if(EmptyUtils.isEmpty(id)){
			result.put("result_code", "1");
			result.put("result_msg", "参数不匹配");
			HttpUtils.printHttpServletResponse(GsonUtil.toJson(result));
			return;
		}
		
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		
		List<ProvinceInfo> provinces = provinceInfoService.queryProvincesWithCitiesByParam(param);
		if(provinces!=null&&provinces.size()>0){
			result.put("result_code", "0");
			result.put("result_msg", "查询成功");
			result.put("provinces", provinces);
		}else{
			result.put("result_code", "1");
			result.put("result_msg", "没有找到数据");
		}
		HttpUtils.printHttpServletResponse(GsonUtil.toJson(result));
		return;
	}
}
