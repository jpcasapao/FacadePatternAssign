class HouseKeeping implements HotelService {
    private int roomNumber;
    
    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public void cleanRoom(int roomNumber) {
        System.out.println("HouseKeeping: Cleaning room " + roomNumber);
    }
    
    @Override
    public void performService() {
        cleanRoom(roomNumber);
    }
}