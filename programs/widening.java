class widening{


	public static void main(String[] args){

		byte b1 = 255;
		
		short s1 = b1 ;
		System.out.println(s1);//127

		int i1 = (int)b1 ;
		System.out.println(i1);//127

		long l1 = b1;
		System.out.println(l1);//127

		char ch = (char)b1;
		System.out.println(ch);



	}

}	