package decorator;

public class BrokenSender implements Sender{
    private Sender sender;
    public BrokenSender(Sender sender){
        this.sender = sender;
    }
    @Override
    public void send(String message) {
            throw new RuntimeException();
    }
}
