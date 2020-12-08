package chapter_5;

public class Client2 {
    public static void main(String[] args) {
        InstallSoftWare invoker = new InstallSoftWare();
        invoker.installWizard(new Wizard());
    }
}
