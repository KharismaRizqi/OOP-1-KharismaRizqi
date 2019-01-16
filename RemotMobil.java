
public class RemotMobil {
	public static void main (String[] args) {
		MobilRemot mobilremot = new MobilRemot ();
		mobilremot.batrrey = 10;
		mobilremot.turnOnMachine = true;
		mobilremot.frontspeed = 45;
		mobilremot.backspeed = 0;
		mobilremot.rem = 0;
		mobilremot.frontSensor = 10;
		
		
		mobilremot.speedcontrol();
	}

}
