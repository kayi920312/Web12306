package com.ssm.web.by;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import util.BeyondverbalHttpUtil;

@Controller("beyondverbalAction")
public class BeyondverbalAction{

	private static final long serialVersionUID = 1L;
	
	//获取token地址
	@Value("${getToken}")
	private String getToken_url;
	
	//apikey
	@Value("${apiKey}")
	private String apiKey;
	
	//grant_type
	@Value("${grant_type}")
	private String grant_type;
	
	//toStart
	@Value("${toStart}")
	private String toStart;
	
	/**
	 * 获取token
	 */
	public void getToken(){
		String param = "grant_type="+grant_type+"&apiKey="+apiKey;
		String result = BeyondverbalHttpUtil.getToken(getToken_url, param);
//		printHttpServletResponse(result);
	}
	
	/**
	 * to start
	 */
	public void toStart(){	
		String token = "G1c6PPer_n7njpg8k27DqFNXolHpDrzd8FO-6zrajO3jfj2lgLq3RRJUOXeMY1sQx9wHeX6I38G7dNTxSAMbgSqxIr68JZWyFPXY64ou9RPhzpclCuklUGDr7vLZHKiLfcQD0ledzkMos82ltcGYWscHbVeq9uRoe2iPEbSsWEaZEjTza8sF_MQwa_RQ-IoWQI0XNVF4L-2cGY7ba67YhisY-K4j-6CLkghhJ8bAnC9SNbHROqFioCerfDmF-Fqxygi4Sp0XasoE3T0IqlGfRT4bDJ99KUEf7HVRcStG07cPIynvjsju60i-AsOCqt3ptbZcO4nFC8iaEp-SIrgVW2All_3rrAHE6SY4aY4h_6_Tcoi_UB4Csp9YZ1S1FLm4I4GhfHDVBDJkUUoJ80TcU1MYgJPYyCX9Fx3jgNZ48HnxT8erM_E7K-nmPY-bKB65ODrxDTWj0ZjOrmTUdaDEm11iziEUGIstIqjvYfwhNC8bbdIGREmbQmfRYRAXVxouBr98lO_syLr_eYhGptlm8i7U00FBNwG2lt8MC4m5rhWCjCaHOChFxxgKcOs4MmOZy7lnfVjjdDdaLgE-s_lsRzInVeWmiUN9JVLsc2cbGwiOr_g3FhsmChqvcbRu3FL66TGgV4FSmpJETNGNY-4MfHNvC-Xj7Hja8BkjP4R4Rts5CHRKDE-OlHg_3tp_Y2DYQnJg0nAPb2u3IE6kjF0hC2Es6Qx0XAhvY-ySHtwFJY-iGnoQ7SdfvBAqqsoh47-fGGhT7kAsrvYbU49hbZXW_9JZPbwtd3-b9SwkRIuYrANiKQ6BaU8oVycDPGoEi7v2xG6PAg";
		String result = BeyondverbalHttpUtil.toStart(toStart, "{'dataFormat':{'type':'WAV'}}", token);
		System.out.println(result);
	}
	
	/**
	 * up stream
	 */
	public void upStream(){}
}
