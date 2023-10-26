package decorator;

public class PersistentSender extends SenderDecorator {

    public PersistentSender(Sender sender) {
        this.sender = sender;
    }

    public void send(String message) {
        int attempts = 0;
        System.out.println("Persistent sender");
        do {
            try {
                sender.send(message);
                return;
            } catch (RuntimeException e) {
                attempts++;
            }
        } while (attempts < 2);
        throw new RuntimeException();
    }
}
