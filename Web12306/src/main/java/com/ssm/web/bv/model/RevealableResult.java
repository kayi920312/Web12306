package com.ssm.web.bv.model;

/**
 * 展示到APP的结果
 * @author kaiying.chen
 */
public class RevealableResult {
	
	private String timePoint;//时间点
	private Valence valence;
	private Arousal arousal;
	private Temper temper;
	private Mood mood;
	private CompositeMood compositeMood;

	public String getTimePoint() {
		return timePoint;
	}

	public void setTimePoint(String timePoint) {
		this.timePoint = timePoint;
	}

	public Valence getValence() {
		return valence;
	}

	public void setValence(Valence valence) {
		this.valence = valence;
	}

	public Arousal getArousal() {
		return arousal;
	}

	public void setArousal(Arousal arousal) {
		this.arousal = arousal;
	}

	public Temper getTemper() {
		return temper;
	}

	public void setTemper(Temper temper) {
		this.temper = temper;
	}

	public Mood getMood() {
		return mood;
	}

	public void setMood(Mood mood) {
		this.mood = mood;
	}

	public CompositeMood getCompositeMood() {
		return compositeMood;
	}

	public void setCompositeMood(CompositeMood compositeMood) {
		this.compositeMood = compositeMood;
	}

	//valence
	public class Valence{
		
		private String value;
		private String mode;
		
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			if("low".equals(mode)){
				this.mode = "低";
			}else if("neutral".equals(mode)){
				this.mode = "中";
			}else if("high".equals(mode)){
				this.mode = "高";
			}else{
				this.mode = mode;
			}
		}
		
	}
	
	//arousal
	public class Arousal{
		
		private String value;
		private String mode;
		
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			if("low".equals(mode)){
				this.mode = "低";
			}else if("neutral".equals(mode)){
				this.mode = "中";
			}else if("high".equals(mode)){
				this.mode = "高";
			}else{
				this.mode = mode;
			}
		}
		
	}
	
	//temper
	public class Temper{
		
		private String value;
		private String mode;
		
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			if("low".equals(mode)){
				this.mode = "低";
			}else if("neutral".equals(mode)){
				this.mode = "中";
			}else if("high".equals(mode)){
				this.mode = "高";
			}else{
				this.mode = mode;
			}
		}
		
	}
	
	//mood
	public class Mood{
		
		private String primary;
		private String secondary;
		
		public String getPrimary() {
			return primary;
		}
		public void setPrimary(String primary) {
			this.primary = primary;
		}
		public String getSecondary() {
			return secondary;
		}
		public void setSecondary(String secondary) {
			this.secondary = secondary;
		}
		
	}
	
	//compositeMood
	public class CompositeMood{
		
		private String primary;
		private String secondary;
		
		public String getPrimary() {
			return primary;
		}
		public void setPrimary(String primary) {
			this.primary = primary;
		}
		public String getSecondary() {
			return secondary;
		}
		public void setSecondary(String secondary) {
			this.secondary = secondary;
		}
		
	}
	
}
