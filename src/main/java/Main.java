//http://api.postcodes.io/
//Dawid Wilemski 3P
//kody pocztowe dla Wielkiej Brytanii
//przykład kodu: SW1A 2AA
//przykład kodu: L1 8JQ
public class Main {
    public static void main(String[] args){
        String podany = Menu.podanyKod();
        Connect.info(podany);
        Google.generuj(podany);
    }
}

