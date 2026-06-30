class CheckInt{

	public static void main(String[] args){
		
		int i = (int)2147483649l; // 2147483647
		System.out.println(i);//-2147483647

  		int i1 = (int)(2147483649l * 2);
		System.out.println(i1);

		int i2 = (int)(2147483649l * 2);
		System.out.println(i2);

		int i3 = (int)2147483648l;
		System.out.println(i3);

		byte b1 = (byte)(127*2);
		System.out.println(b1);
		
	}

}