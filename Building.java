class Building {
    protected String address;
    protected double area;

   
    public Building(String address, double area) {
        this.address = address;
        this.area = area;
    }

    
    public void openGate() {
        System.out.println("Gate is opened");
    }

    public void closeGate() {
        System.out.println("Gate is closed");
    }

    public void display() {
        System.out.println("Address: " + address);
        System.out.println("Area: " + area);
    }

    public String toString() {
        return "Address: " + address + ", Area: " + area;
    }
}