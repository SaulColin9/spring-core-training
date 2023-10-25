package decorator;


public class MessageCleaner extends SenderDecorator{
    private Sender sender;
    public MessageCleaner(Sender sender){
        this.sender = sender;
    }
    public void send(String message) {
        System.out.println("Message cleaner");
        message = clean(message);
        sender.send(message);
    }

    public static String clean(String input) {
        return input.replaceAll("^[^a-zA-Z0-9]+|[^a-zA-Z0-9]+$", "");
    }
}
