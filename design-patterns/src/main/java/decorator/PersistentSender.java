package decorator;

public class PersistentSender extends SenderDecorator {
    private static int attempts = 0;

    public PersistentSender(Sender sender) {
        attempts++;
        if (attempts >= 2) {
            throw new RuntimeException();
        }
        System.out.println(attempts);
        this.sender = sender;
    }

    public void send(String message) {
        System.out.println("Persistent sender");

        if (message.isEmpty()) {
            return;
        }
        attempts = 0;
        sender.send(message);


    }
}
