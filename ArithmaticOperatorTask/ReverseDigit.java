class ReverseDigit{

	public static void main(String[] args){

		int num = 123;

		int last = num % 10;
		int middle = (num /10)%10;
		int first = num /100;
	
		int reverse = last * 100 + middle * 10 + first;
		System.out.println("Reverse Number is :"+reverse);
	}

}