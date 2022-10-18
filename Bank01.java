class Bank01{
	public static void main(String[] args){
		BankAccount01 acc1=new BankAccount01();
		BankAccount01 acc2=new BankAccount01();
		acc1.deposite(5000);
        acc2.deposite(7000);
		System.out.println("acc1.balance:"+acc1.balance);
		System.out.println("acc2.balance:"+acc2.balance);
	}
}
