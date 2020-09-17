import java.net.*;
import java.net.http.*;

public class RequestHelper {

    public static String getContent(String url) {
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpResponse response = client.send(HttpRequest.newBuilder()
                            .uri(URI.create("https://theysaidso.com/quote-of-the-day/"))
                            .GET()
                            .build(),
                    HttpResponse.BodyHandlers.ofString());
            return (String) response.body();
        }catch (Exception ex) {
            return "No content";
        }
    }

}
