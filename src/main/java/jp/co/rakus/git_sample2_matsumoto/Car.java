package jp.co.rakus.git_sample2_matsumoto;


public class Car {
	private int speed;
	
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
