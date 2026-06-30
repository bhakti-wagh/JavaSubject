class LargestOfFive{

	public static void main(String[] args){

		int n1 = 25;
		int n2 = 16;
		int n3 = 85;
		int n4 = 78;
		int n5 = 66;

    int largestOfFive;
int Larger = n1 >(largestOfFive=(n1>n2?n1:n2)>(n3>n4?n3:n4)?(n1>n2?n1:n2):(n3>n4?n3:n4))?n1 :largestOfFive;
		System.out.println(Larger);

	}

}