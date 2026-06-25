class Time{
	public static void main(String[] args)
	{

		int minutes = 135;
		
		int hours = minutes / 60 ;

		int remainingMinutes = minutes % 60;

		System.out.println("convert minutes to hours : " +hours);//2

		System.out.println("Remaining Minutes are : " +remainingMinutes);//2

	}
}