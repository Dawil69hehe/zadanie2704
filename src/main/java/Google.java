//klasa odpowiada za generowanie linku do google
public class Google {
    public static void generuj(String podany){
        System.out.println("\nLink do google: ");
        String podanynew=podany.replace(" ", "+");
        System.out.println("https://www.google.com/search?q="+podanynew);
        }
}
