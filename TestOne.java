class TestOne {		
	public static void main(String[] args) {
		/*(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. 
		 * Write a program that displays the average speed in kilometers per hour. 
		 * (Note that 1 mile is 1.6 kilometers)*/
		double miles = 24;
		double seconds = 35;
		double minutes = 40;
		double hours = 1;

		double kilometers = miles * 1.6;

		double secondsToMinutes = seconds/60;
		double minutesToHours = (minutes + secondsToMinutes)/60;
		double totalHours = 1 + minutesToHours;

		System.out.println("24 miles in 1 Hour 40 Minutes and 35 Seconds");
 
		//Stating the conversion of miles to kilometers
		System.out.println("Kilometers = 24 miles * 1.6");
		
		//The Conversion of miles to kilometers
		System.out.println(kilometers + " kilometers");
		
		//How long it took to go the distance in hours
		System.out.println(totalHours + " Hours");
		
		//The division of kilometers by hours
		System.out.println(kilometers/totalHours + " KPH");
		
 
	}
}

