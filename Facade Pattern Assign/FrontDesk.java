class FrontDesk {
    public void valetService(String plateNumber, boolean isPickup) {
        Valet valet = new Valet(plateNumber, isPickup);
        valet.performService();
    }
    
    public void houseKeepingService(int roomNumber) {
        HouseKeeping houseKeeping = new HouseKeeping(roomNumber);
        houseKeeping.performService();
    }
    
    public void cartService(int numberOfCarts) {
        Cart cart = new Cart(numberOfCarts);
        cart.performService();
    }
    
    // Comprehensive check-in method using multiple services
    public void checkInGuest(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("\n=== Guest Check-In Process ===");
        valetService(plateNumber, false); // Park vehicle
        houseKeepingService(roomNumber);  // Clean room
        cartService(numberOfCarts);       // Request carts
        System.out.println("Check-in completed successfully!\n");
    }
    
    // Comprehensive check-out method using multiple services
    public void checkOutGuest(String plateNumber, int roomNumber) {
        System.out.println("\n=== Guest Check-Out Process ===");
        houseKeepingService(roomNumber);  // Clean room after check-out
        valetService(plateNumber, true);  // Pick up vehicle
        System.out.println("Check-out completed successfully!\n");
    }
}