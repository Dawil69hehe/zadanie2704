//http://api.postcodes.io/postcodes/OX49%205NU
//Dawid Wilemski 3P
//kody pocztowe dla Wielkiej Brytanii
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        String podany = Menu.podanyKod();

        /*

        try {
            URL url = new URL("http://api.postcodes.io/postcodes/OX49%205NU");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200){
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            }
            else {
                String inline = "";
                Scanner scanner = new Scanner(url.openStream());
                while(scanner.hasNext()){
                    inline += scanner.nextLine();
                }
                scanner.close();
                JSONParser parser = new JSONParser();
                JSONObject data_obj = (JSONObject) parser.parse(inline);
                JSONObject tablica = (JSONObject) data_obj.get("result");
                System.out.println(tablica.get("postcode"));
                System.out.println(tablica.get("country"));
                System.out.println(tablica.get("region"));
                System.out.println(tablica.get("longitude"));
                System.out.println(tablica.get("latitude"));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        */

    }
}

