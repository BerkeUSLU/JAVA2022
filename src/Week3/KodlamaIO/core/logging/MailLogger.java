package Week3.KodlamaIO.core.logging;

public class MailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println(data + " logged to e-mail!");
    }
}
