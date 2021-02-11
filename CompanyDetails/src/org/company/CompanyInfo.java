package org.company;

public class CompanyInfo {
    public void companyName(String companyName) {
        System.out.println("Company Name :" +companyName);
    }

    public void companyName(String companyName,String companyAddress) {
        System.out.println("Company Name :" +companyName +" Address : "+companyAddress);
    }

    public static void main(String[] args) {
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.companyName("Microsoft");
        companyInfo.companyName("Microsoft","USA");
    }
}
