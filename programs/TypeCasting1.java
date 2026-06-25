class TypeCasting1{
	
	public static void main(String[] args){
	
		short s1 = 650;
		System.out.println(s1);//650

		//char c1 = s1;
		//System.out.println(c1);// possible lossy conversion from short to char
	
		int c1 = s1;
		System.out.println(c1);//650

		long l1 = s1;
		System.out.println(l1);//650

		float f1 = s1;
		System.out.println(f1);//650.0

		double d1 = s1;
		System.out.println(d1);//650.0

	}
}