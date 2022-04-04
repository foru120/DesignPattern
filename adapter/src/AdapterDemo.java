import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdapterDemo {
    public static void main(String[] args) {
        WebAdapter adapter = new WebAdapter(new FancyRequester());
        WebClient client = new WebClient(adapter);
        client.doWork();
    }
}
