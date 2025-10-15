class Valet implements HotelService {
    private String plateNumber;
    private boolean isPickup;
    
    public Valet(String plateNumber, boolean isPickup) {
        this.plateNumber = plateNumber;
        this.isPickup = isPickup;
    }
    
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet: Vehicle with plate number " + plateNumber + " is being picked up");
    }
    
    @Override
    public void performService() {
        if (isPickup) {
            pickUpVehicle(plateNumber);
        } else {
            System.out.println("Valet: Vehicle with plate number " + plateNumber + " is being parked");
        }
    }
}
