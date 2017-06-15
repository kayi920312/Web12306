package com.ssm.web.city.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import com.ssm.web.city.model.CityInfo;
import com.ssm.web.city.service.CityInfoService;

import util.EmptyUtils;
import util.GsonUtil;
import util.HttpUtils;

/**
 * 城市信息Action
 * @author kayi9
 *
 */
@Controller("cityInfoAction")
public class CityInfoAction {
	
	@Resource(name="cityInfoServiceImpl")
	private CityInfoService cityInfoService;
	
	/**
	 * id查询城市信息
	 */
	public void queryCityById(){
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
		
		List<CityInfo> cities = cityInfoService.queryCitiesByParam(param);
		if(cities!=null&&cities.size()>0){
			result.put("result_code", "0");
			result.put("result_msg", "查询成功");
			result.put("citis", cities);
		}else{
			result.put("result_code", "1");
			result.put("result_msg", "没有找到数据");
		}
		HttpUtils.printHttpServletResponse(GsonUtil.toJson(result));
		return;
	}
}
