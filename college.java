class college {
	public static void main(String[] args) {
       Student s1=new Student();
       Student s2=new Student();
	   
    s1.sno    =101;
    s1.sname  ="saddam";
    s1.course ="sap";
	s1.fee    =12000;
		System.out.println();	
	s2.sno    =102;
    s2.sname  ="abdul";
    s2.course ="ricemill";
	s2.fee    =10000;
	
	System.out.println("\ns1 object values");
	System.out.println(s1.sno+"\n "+s1.sname+"\n"+s1.course+"\n" +s1.fee);		
	
	    System.out.println();		
	System.out.println("\ns2 object values");
	System.out.println("   s2.sno\t:" +s2.sno);		
	System.out.println(" s2.sname\t:" +s2.sname);		
	System.out.println("s2.course\t:" +s2.course);
	System.out.println("   s2.fee\t:" +s2.fee);
		System.out.println();		

	} 
}