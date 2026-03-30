public class Demo {
    public static void main(String[] args) {

        Building b = new Building("Lahore", 1200);
        House h = new House("Islamabad", 1500, 5, "Ali");
        SmartHouse s = new SmartHouse("Karachi", 2000, 7, "Ahmed", "CCTV", "Alexa");

        System.out.println("----- Building -----");
        b.display();
        System.out.println(b.toString());
        b.openGate();
        b.closeGate();

        System.out.println("\n----- House -----");
        h.display();
        System.out.println(h.toString());

        System.out.println("\n----- Smart House -----");
        s.display();
        System.out.println(s.toString());
    }
}