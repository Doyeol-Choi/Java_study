package AccountEx;

public class Client {
	
	private String client;
	private String account;
	private int balance;
	
	
	public Client(String client, String account, int balance) {
		super();
		this.client = client;
		this.account = account;
		this.balance = balance;
	}
	
	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
