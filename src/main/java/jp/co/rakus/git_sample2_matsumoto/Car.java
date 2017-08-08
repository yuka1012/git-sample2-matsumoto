package jp.co.rakus.git_sample2_matsumoto;


public class Car {
	private int speed;
	private String bodyColor;
	
	public String getBodyColor() {
		return bodyColor;
	}

	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
		
	}

	public void run(){
		this.speed+=10;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public void setSpeed(int speed){
		this.speed=speed;
	}
	
	public void stop(){
		this.speed=0;
	}

}
