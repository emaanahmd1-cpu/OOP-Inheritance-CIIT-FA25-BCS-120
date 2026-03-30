class House extends Building {
    protected int numberOfRooms;
    protected String ownerName;

    
    public House(String address, double area, int numberOfRooms, String ownerName) {
        super(address, area);
        this.numberOfRooms = numberOfRooms;
        this.ownerName = ownerName;
    }

    @Override
    public void display() {
        super.display(); // required
        System.out.println("Rooms: " + numberOfRooms);
        System.out.println("Owner: " + ownerName);
    }

    @Override
    public String toString() {
        return super.toString() + ", Rooms: " + numberOfRooms + ", Owner: " + ownerName;
    }
}