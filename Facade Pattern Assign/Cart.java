class Cart implements HotelService {
    private int numberOfCarts;
    
    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }
    
    public void requestCart(int numberOfCarts) {
        System.out.println("Cart: " + numberOfCarts + " luggage cart(s) requested");
    }
    
    @Override
    public void performService() {
        requestCart(numberOfCarts);
    }
}