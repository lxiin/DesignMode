package chapter_15.simple;

public class ConcreteCommand extends Command {

    private Receiver receiver;


    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
