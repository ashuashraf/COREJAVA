class FrontOffice {
	public static void main(String[] args){
           College hkcollege =new College();
		   Student s1=new Student();
		   s1.sno=101;
		   s1.name="vinod";
		   s1.course="cj";
		   s1.fee=1000;
		   hkcollege.join(s1);
	}
}
