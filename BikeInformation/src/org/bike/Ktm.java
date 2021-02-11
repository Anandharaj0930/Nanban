package org.bike;

public class Ktm implements Bike {

    @Override
    public void cost() {
        System.out.println("KTM Bike Cost");
    }

    @Override
    public void speed() {
        System.out.println("KTM Bike Speed");
    }

    public static void main(String[] args) {
        Ktm ktm = new Ktm();
        ktm.cost();
        ktm.speed();
    }
}
