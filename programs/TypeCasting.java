class TypeCasting{
	
	public static void main(String[] args){

		byte b1 = 100;
		System.out.println(b1);//100

		short s1 = b1;
		System.out.println(s1);//100

		//char c1 = b1;
		//System.out.println(c1);//possible lossy conversion from byte to char
		
		int c1 = b1;
		System.out.println(c1);//100

		long l1 = b1;
		System.out.println(l1);//100

		float f1 = b1;
		System.out.println(f1);//100.0

		double d1 = b1;
		System.out.println(d1);//100.0

		
	}
}