package service;

public class Model {
	private String action;
	private int know;
	/*
	private int Fatigue;
	private String feel;
	private int feelv;
	*/
	
	public Model() {}
	public Model(String action, int know) {
		super();
		this.action = action;
		this.know = know;
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
	
	
	@Override
	public String toString() {
		return "Model [action=" + action + ", know=" + know + "]";
	}


	
	
}
