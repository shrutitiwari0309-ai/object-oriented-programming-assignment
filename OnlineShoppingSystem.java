class OnlineShoppingSystem {

    // Payment thread
    static class Payment extends Thread {
        public void run() {
            System.out.println("Processing payment...");
        }
    }

    // Order processing thread
    static class OrderProcessing extends Thread {
        public void run() {
            System.out.println("Order confirmed...");
        }
    }

    public static void main(String[] args) {

        // Create thread objects
        Payment paymentThread = new Payment();
        OrderProcessing orderThread = new OrderProcessing();

        // Start threads
        paymentThread.start();
        orderThread.start();
    }
}
