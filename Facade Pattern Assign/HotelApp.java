public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();
        
        // Individual service usage
        System.out.println("=== Individual Service Requests ===");
        frontDesk.valetService("ABC123", false);
        frontDesk.houseKeepingService(101);
        frontDesk.cartService(2);
        
        // Comprehensive check-in process
        frontDesk.checkInGuest("XYZ789", 205, 3);
        
        // Comprehensive check-out process
        frontDesk.checkOutGuest("XYZ789", 205);
        
        // Additional individual requests
        System.out.println("=== Additional Requests ===");
        frontDesk.cartService(1);
        frontDesk.houseKeepingService(305);
    }
}