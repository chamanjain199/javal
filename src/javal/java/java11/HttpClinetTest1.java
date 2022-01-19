package javal.java.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClinetTest1 {

	public static void main(String[] args) {

		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/albums")).GET().build();
		try {
			HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
			if(httpResponse.statusCode()==200) {
				System.out.println(httpResponse.body());
			}
		} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
