class SmartHouse extends House {
    protected String securitySystem;
    protected String voiceControl;

   
    public SmartHouse(String address, double area, int numberOfRooms, String ownerName,
                      String securitySystem, String voiceControl) {
        super(address, area, numberOfRooms, ownerName);
        this.securitySystem = securitySystem;
        this.voiceControl = voiceControl;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Security System: " + securitySystem);
        System.out.println("Voice Control: " + voiceControl);
    }

    @Override
    public String toString() {
        return super.toString() + ", Security: " + securitySystem + ", Voice Control: " + voiceControl;
    }
}