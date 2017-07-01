package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssm.web.bv.model.AnalysisSegment;
import com.ssm.web.bv.model.OutResult;
import com.ssm.web.bv.model.RevealableResult;

import util.GsonUtil;

public class SimpleTest {


	public static void main(String[] args) {
		File file = new File("G:/最后结果.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] temp = new byte[(int) file.length()];
			fis.read(temp);
			String result = new String(temp);
			OutResult outResult = GsonUtil.toBean(result, OutResult.class);
			
			//封装APP展示的结果类
			Map<String, Object> revealableMap = new HashMap<String, Object>();
			List<RevealableResult> revealableList = new ArrayList<RevealableResult>();
			RevealableResult revealableResult = null;
			
			revealableMap.put("sessionStatus", outResult.getResult().getSessionStatus());
			List<AnalysisSegment> analysisSegments = outResult.getResult().getAnalysisSegments();
			for (AnalysisSegment analysisSegment : analysisSegments) {
				revealableResult = new RevealableResult();
				revealableResult.setTimePoint((analysisSegment.getOffset()+analysisSegment.getDuration())+"");
				
				RevealableResult.Valence inValence = revealableResult.new Valence();
				RevealableResult.Arousal inArousal = revealableResult.new Arousal();
				RevealableResult.Temper inTemper = revealableResult.new Temper();
				RevealableResult.Mood inMood = revealableResult.new Mood();
				RevealableResult.CompositeMood inCompositeMood = revealableResult.new CompositeMood();
				
				inValence.setValue(analysisSegment.getAnalysis().getValence().getValue());
				inValence.setMode(analysisSegment.getAnalysis().getValence().getGroup());
				
				inArousal.setValue(analysisSegment.getAnalysis().getArousal().getValue());
				inArousal.setMode(analysisSegment.getAnalysis().getArousal().getGroup());
				
				inTemper.setValue(analysisSegment.getAnalysis().getTemper().getValue());
				inTemper.setMode(analysisSegment.getAnalysis().getTemper().getGroup());
				
				inMood.setPrimary("开心");
				inMood.setSecondary("开心的，愉快的");
				
				inCompositeMood.setPrimary("心情愉悦的");
				inCompositeMood.setSecondary("躺开心扉的");
				
				revealableResult.setArousal(inArousal);
				revealableResult.setCompositeMood(inCompositeMood);
				revealableResult.setMood(inMood);
				revealableResult.setTemper(inTemper);
				revealableResult.setValence(inValence);
				
				revealableMap.put("offset", analysisSegment.getOffset());
				
				revealableList.add(revealableResult);
			}
			revealableMap.put("revealableResult", revealableList);
			System.out.println(GsonUtil.toJson(revealableMap));
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
