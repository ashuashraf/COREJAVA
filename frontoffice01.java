class frontoffice01{
	public static void main(String[] args){
		college01 HKcollege=new college01();
		student01 s01=new student01();
		s01.sno=100;
		s01.sname="ashraf";
		s01.course="corejava";
		s01.fee=10000;
		HKcollege join(s01);
		System.out.println("student admission is confirmed with the details");  
		System.out.println("s01.sno:\t\t"+s01.sno);
		System.out.println("s01.sname:\t\t"+s01.sname);
		System.out.println("s01.course:\t\t"+s01.course);
		System.out.println("s01.fee:\t\t"+s01.fee);
	}
}