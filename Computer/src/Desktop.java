public class Desktop implements HardWare, Software {

    @Override
    public void hardwareResources() {
        System.out.println("Hardware Resources");
    }

    @Override
    public void softwareResources() {
        System.out.println("Software Resources");
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        desktop.hardwareResources();
        desktop.softwareResources();
    }

}
