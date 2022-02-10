package gardella.vik.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import javax.swing.*;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {

		//Initializing Test Data
		Account a = new Account(1234, "John", "Smith", 1000.00, 0.035);

		//Initializing GUI
		JFrame gui = new JFrame();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(800, 600);
		
		ArrayList<JPanel> accountPanels = new ArrayList<JPanel>();
		JPanel accountInfo1 = new JPanel();
		accountPanels.add(accountInfo1);
		JPanel accountInfo2 = new JPanel();
		accountPanels.add(accountInfo2);
		JPanel accountInfo3 = new JPanel();
		accountPanels.add(accountInfo3);

		for(int i=0; i<accountPanels.size(); i++){
			accountPanels.get(i).add(new JTextField("Account ID: " + a.getAccountID()));
			accountPanels.get(i).add(new JTextField("Name: ".concat(a.getFirstName()) + " " + a.getLastName()));
			accountPanels.get(i).add(new JTextField("Balance: " + a.getBalance()));

			gui.add(accountPanels.get(i));
		}

		gui.setVisible(true);

		//Executing the Application the Spring way
		SpringApplication.run(BankApplication.class, args);
	}

}
