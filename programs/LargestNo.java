class LargestNo{

	public static void main(String[] args){

		int n1 = 45;
		int n2 = 4;
		int n3 = 65;
		int n4 = 35;
   	
		int res = n1 < (n2<n3? n2 : n3) ? n1 : (n2 < n3? n2 : n3) ; 	
		
		int small = res < n4 ? res  : n4;

		System.out.println(small);



	// nested 
	int result = (n1 < n2 ? n1 : n2 ) < (n3 < n4 ? n3 : n4) ?  (n1 < n2 ? n1 : n2 ) : (n3 < n4 ? n3 : n4);
	System.out.println(result);
		
	}


}