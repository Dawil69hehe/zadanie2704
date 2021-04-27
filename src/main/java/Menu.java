import java.util.Scanner;

public class Menu {
    static String podanyKod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz \"help\" po więcej informacji.\nPodaj kod pocztowy: ");
        String inkod = scan.nextLine();
        if (inkod.indexOf("help")==0){
            System.out.println("Aplikacja ta służy do wyszukiwania lokalizacji po jej kodzie pocztowym. " +
                    "\nObejmuje ona obszar Wielkiej Brytanii. Przykładowy kod pocztowy: OX49 205NU\nPodaj kod pocztowy: ");
            inkod = scan.nextLine();
        }
        return inkod;
    }
}
