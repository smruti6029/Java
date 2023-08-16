package com.thread;

class TrafficPoint {
	String signal = "RED";
	  public void changeSignal() {
		 System.out.println("Signal is, " + signal);
		 try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		this.signal = "GREEN";
		System.out.println("Signal is, " + signal);
		moveCar();
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.signal = "RED";
		notifyAll();
		changeSignal();
	}
	
	public void moveCar() {
		int i = 1;
		while(signal.equals("GREEN")) {
			System.out.println("Car - " + i + " has crossed traffic line");
			i++;
			if(i==15)
			{
				break;
			}
			
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
	}
	
	synchronized public void waitForSignal() {
		changeSignal();
//		while(!signal.equals("GREEN")) {
//			try {
//				wait();
//			} catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}
}

class Car extends Thread {
	TrafficPoint trafficPoint;
	
	public Car(TrafficPoint trafficPoint) {
		this.trafficPoint = trafficPoint;
	}
	
	 public void run() {
		while(true) {
			trafficPoint.waitForSignal();
		}
	}
}

public class Test {
	
	public static void main(String args[]) throws InterruptedException {
		TrafficPoint trafficPoint = new TrafficPoint();
		Car car1 = new Car(trafficPoint);
		car1.start();
		car1.join();
	}
}

