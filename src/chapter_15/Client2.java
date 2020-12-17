package chapter_15;

public class Client2 {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        System.out.println("客户要求增加一项需求----------");
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }

}
