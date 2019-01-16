
public class MobilRemot {
	//atribut
	int frontspeed;
	String merk;
	int backspeed;
	int rem;
	int batrrey;
	int frontSensor;
	boolean turnOnMachine;
	
	void speedcontrol() {
		if (batrrey == 100) {
			System.out.println("batrrey Full Let's Play");
		} else if (batrrey <= 0){
			System.out.println("Charge Mee Please");
		} else if (batrrey <= 3) {
			System.out.println("Batrrey Low WARNING!!");
			machine();
		} else {
			machine();
		}
	}
	
	void machine () {
		if (!turnOnMachine) {
			} else {
				System.out.println("GO!!!!, Make Your Experiance!!");
				speedCheck ();
			}
		}
	
	void speedCheck() {
		merk = rtString();
		if (frontspeed >=5 && backspeed > 0 || rem > 0) {
			System.out.println("Let's Go!!!, Make It Fast");
		} else {
			System.out.println("Make It Move, Machine Already Active");
			SpeedWarning();
		}
	}
	
	void SpeedWarning() {
		if (frontspeed < 45) {
			
		} else if (frontspeed >= 45 ) {
			System.out.println("You So Fast!!");
		} else if (frontspeed >= 55 ) {
			System.out.println("Make Car To Be Slow!!");
				
		}
		
		Sensor();
		
	}
	
	void Sensor() {
		if (frontSensor < 10 ) {
			System.out.println("Warning In Front Of You");
		} else if (frontSensor >= 5) {
			System.out.println("PRESS REM NOW!!!");
		}
	}
	
	
	String rtString() {
		return "Tamia";
	}

}
