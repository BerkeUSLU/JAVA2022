package Week3.KodlamaIO.core.logging;

public class FileLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println(data + " logged to File!");
    }
}
