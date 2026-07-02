class Decrement {
		public static void main(String[] args){
			
		int poc = 100; //90

	System.out.println(--poc);//99
	System.out.println(--poc);//98


	System.out.println(poc--);//98
	System.out.println(poc--);//97

	System.out.println(--poc);//95


	System.out.println(poc--);//95


	System.out.println(--poc +poc--);//93+94  //132
	System.out.println(--poc - poc--);//92 - 92 //0
      System.out.println(poc--);//91
     System.out.println(poc);//90






	}

}