
public class ClockHour {

	public static void main(String[] args) {
		System.out.println(angle(1,00));

	}
	public static double angle(int hour, int minute){
		double hourAngle = 0.5*(hour*60+minute);
		double minuteAngle = 6*minute;
		double angle = Math.abs(hourAngle-minuteAngle);
		return angle;
	}

}
