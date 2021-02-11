package org.company;

import org.client.Client;

public class Company extends Client{
    public void companyName() {
        System.out.println("Company Name : TCS");
    }

    public static void main(String[] args) {
        Company company= new Company();
        company.companyName();
        company.clientName();
    }
}
