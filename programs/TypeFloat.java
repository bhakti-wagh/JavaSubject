class TypeFloat{

	public static void main(String[] args)throws InterruptedException{

       float l1 = Integer.MAX_VALUE;
	
	for(; ; l1++){

	System.out.println((byte)l1+"--->"+l1);
	 Thread.sleep(1000); 

	}
	
	}

}

//float = float.Max_Value
// (byte)l1 -> for byte it gives -1--->3.4028235E38 number 
//(int)l1 -> for int it gives  2147483647--->3.4028235E38
//(long)l1 -> for long ti gives 9223372036854775807--->3.4028235E38
//(short)l1 -> for shor it gives -1--->3.4028235E38 
//(char)l1 -> for char it gives ?--->3.4028235E38
//(double)l1 -> for double it gives 3.4028234663852886E38--->3.4028235E38


//float =  Long.Max_value
//(byte)l1 -> for byte it gives -1--->9.223372E18 number 
//(int)l1 -> for int it gives  2147483647--->9.223372E18
//(long)l1 -> for long ti gives 9223372036854775807--->9.223372E18
//(short)l1 -> for shor it gives -1--->9.223372E18
//(char)l1 -> for char it gives ?--->9.223372E18
//(double)l1 -> for double it gives 9.223372036854776E18--->9.223372E18

