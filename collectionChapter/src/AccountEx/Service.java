package AccountEx;

public class Service {

	public void saveData(Client client) {
		for (int i=0; i<Main.list.length; i++) {
			if (Main.list[i] == null) {				
				Main.list[i] = client;
				return;
			}
		}
	}

	public Client chkAccount(String accountNum) {
		for (int i=0; i<Main.list.length; i++) {
			if (Main.list[i] != null) {
				if (accountNum.equals(Main.list[i].getAccount())) {
					Client account = Main.list[i];
					return account;
				}
			}
		}
		return null;
	}

}
