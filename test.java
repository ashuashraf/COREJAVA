class test 
{
	static void m1(){
		System.out.println("m1");
	}
	void m2(){
		System.out.println("m2");
	}
	static int m3(){
		return 10;
	}
	double m4(){
		return 12.10;
	}
	void m5(){}
	void m6(){return;}
	//void m7(){return 10;}
	//int m8(){}
	//int m9(){return true;}
	//int m10(){}
	public static void main(String[] args) 
	{
		System.out.println("start main");
		m1();
		//m2();
		test t=new test();
		t.m2();
		int a=m3();
		//m4();
		//System.out.println(m3());
	}
}
