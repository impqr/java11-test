package java11;

import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientTest {
    @Test
    public void httpSync() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(
                HttpRequest.newBuilder(URI.create("https://baidu.com")).build(),
                HttpResponse.BodyHandlers.ofString()
        );
        System.out.println(response.statusCode());
        System.out.println(response.body());
        System.out.println("request complete");
    }

    @Test
    public void httpAsync() throws ExecutionException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        CompletableFuture<HttpResponse<String>> future = client.sendAsync(
                HttpRequest.newBuilder(URI.create("https://baidu.com")).build(),
                HttpResponse.BodyHandlers.ofString()
        );
        HttpResponse<String> response = future.get();
        System.out.println(response.statusCode());
        System.out.println(response.body());
        System.out.println("request complete");
    }
}
