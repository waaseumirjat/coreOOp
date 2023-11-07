package coreOOP1;

import coreOOP1.CentralTraffic;

public class EnglandTraffic implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic e = new EnglandTraffic();
		e.redStop();
		System.out.println(a);
		
		EnglandTraffic at = new EnglandTraffic();
		at.walkonsymbol();
		ContinentalTraffic aft = new EnglandTraffic();
		aft.trainSymbol();
	}
	
	public void walkonsymbol() {
		System.out.println("This is for walking");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashYellow implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("This is train passing symbol in Africa");
		
	}

}









