package decorator;

public class DecoratorPattern {

    // TODO implement two Senders with enriched logic:
    // 1. Decorator with 2 retries if the message hasn't been sent (threw a RuntimeException)
    // 2. Decorator that removes all leading and trailing non-alphanumeric symbols
    // in the message before sending it

    public static void main(String[] args) {

        Sender simpleEmailSender = new SimpleEmailSender();

        //Since the message is sent, it does not throw the RuntimeException
        simpleEmailSender = new PersistentSender(simpleEmailSender);
        simpleEmailSender.send("Hello");
        simpleEmailSender = new PersistentSender(simpleEmailSender);

        //Cleans
        simpleEmailSender = new MessageCleaner(simpleEmailSender);
        simpleEmailSender.send("____  Hello World %$%#");

        //Throws Exception after two attempts
        simpleEmailSender = new PersistentSender(simpleEmailSender);
        simpleEmailSender = new PersistentSender(simpleEmailSender);

    }
}
