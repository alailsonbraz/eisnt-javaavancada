package com.braz;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        System.out.println(account.getBalance());

    }
}
