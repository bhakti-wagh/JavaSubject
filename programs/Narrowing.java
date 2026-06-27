class Narrowing{

 		public static void main(String[] args){

			long l1 = 758965847895445l;
			
			int i1 = (int)l1;//-2117948011
			System.out.println(i1);

			char c1 = (char)l1;
			System.out.println(c1);//?

			short s1 = (short)l1;
			System.out.println(s1);//-21099

			byte b1 = (byte)l1;
			System.out.println(b1);

		}

}