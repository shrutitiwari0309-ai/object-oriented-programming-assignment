class ChatApplication {

    // Thread for sending messages
    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sender Thread State: " + Thread.currentThread().getState());

                System.out.println("Sending message...");
                Thread.sleep(1000); // simulate delay

                System.out.println("Message sent");

            } catch (InterruptedException e) {
                System.out.println("Sender interrupted");
            }
        }
    }

    // Thread for receiving messages
    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiver Thread State: " + Thread.currentThread().getState());

                System.out.println("Receiving message...");
                Thread.sleep(1000); // simulate delay

                System.out.println("Message received");

            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted");
            }
        }
    }

    public static void main(String[] args) {

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // NEW state
        System.out.println("Sender state before start: " + sender.getState());
        System.out.println("Receiver state before start: " + receiver.getState());

        // Start threads → RUNNABLE state
        sender.start();
        receiver.start();

        try {
            // WAITING for threads to finish
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // TERMINATED state
        System.out.println("Sender state after completion: " + sender.getState());
        System.out.println("Receiver state after completion: " + receiver.getState());
    }
}
