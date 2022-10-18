class testEvenOrOdd {
	public static void main(String[]args){
		int num=10;
		boolean even=EvenOrOdd.isEven(num);
		if(even){
			System.out.println(num+"is an even num");
		}else{
			System.out.println(num+"is an odd num");
			}
	}
}