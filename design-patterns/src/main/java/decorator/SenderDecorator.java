package decorator;

public abstract class SenderDecorator implements Sender{
    Sender sender;
    public abstract void send(String message);
}
