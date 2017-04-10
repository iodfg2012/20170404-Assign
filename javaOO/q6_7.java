package Exercise;

public class Account {

	private String owner;
	private long balance;
	private long amount;
	private long bal;


	public Account(String owner) {
		this.owner = owner;
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public long deposit(long amount) {
		bal = balance +  amount;
		System.out.println("적금 된 금액 : " + amount);
		System.out.println("현재 금액 : " + bal);
		return bal;

	}

	public long withdraw(long amount) {
		bal -= amount;
		System.out.println("출금 된 금액 : " + amount);
		System.out.println("현재 금액 : " + bal);
		return bal;

	}

	public static void main(String[] args) {
		Account AC = new Account(500000);
		/*
		Account acOwner = new Account("예금주");
		Account acBalance = new Account(100000000);
		Account acOwnerBalance = new Account("예금주", 100000000);

		System.out.println(acOwner.getOwner());
		System.out.println(acBalance.getBalance());
		System.out.println(acOwnerBalance.getOwner());
		System.out.println(new Account("홍길동").getOwner());
		System.out.println(new Account(250000000).getBalance());
		*/ 

		AC.deposit(25000);
		AC.withdraw(5000);
		AC.deposit(8000);

	}

}
