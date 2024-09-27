package service;

public class Model {
	private String action;
	private int know;
	private int Fatigue;
	private int feel;
	private String explanation;
	
	public Model() {
		// TODO Auto-generated constructor stub
	}
		
	
	
	
	public Model(String action, int know, int fatigue, int feel, String explanation) {
		super();
		this.action = action;
		this.know = know;
		Fatigue = fatigue;
		this.feel = feel;
		this.explanation = explanation;
	}




	public String getAction() {
		return action;
	}




	public void setAction(String action) {
		this.action = action;
	}




	public int getKnow() {
		return know;
	}




	public void setKnow(int know) {
		this.know = know;
	}




	public int getFatigue() {
		return Fatigue;
	}




	public void setFatigue(int fatigue) {
		Fatigue = fatigue;
	}




	public int getFeel() {
		return feel;
	}




	public void setFeel(int feel) {
		this.feel = feel;
	}




	public String getExplanation() {
		return explanation;
	}




	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}




	@Override
	public String toString() {
		return "Model [action=" + action + ", know=" + know + ", Fatigue=" + Fatigue + ", feel=" + feel
				+ ", explanation=" + explanation + "]";
	}
	

	
	
}
