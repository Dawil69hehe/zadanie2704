//klasa łączy się z api pobiera dane i wyświetla je
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;

import static java.lang.System.exit;

public class Connect {

    static void info(String pod){
        try {
            URL url = new URL("http://api.postcodes.io/postcodes/"+pod);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCode = conn.getResponseCode();

            if (responseCode != 200){
                System.out.println("Sprawdź poprawność danych wejściowych.");
                exit(0);
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

                System.out.println("Kod pocztowy: "+tablica.get("postcode"));
                System.out.println("Kraj: "+tablica.get("country"));
                System.out.println("Region: "+tablica.get("region"));
                System.out.println("Współrzędne: ");
                System.out.println(tablica.get("longitude"));
                System.out.println("na");
                System.out.println(tablica.get("latitude"));
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }
    }
}
