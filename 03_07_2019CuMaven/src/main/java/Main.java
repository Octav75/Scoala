import java.util.*;

public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        Map<String, String> map = new HashMap<>();
//        System.out.println("Introduceti tara si orasul");
////        String input = sc.nextLine();
////        System.out.println("Tara si orasul sunt: " + input);
////        Scanner oras = new Scanner(System.in);
////        System.out.println("Introduceti orasul");
////        String city = oras.nextLine();
////        System.out.println("Orasul este: " + city);
//
//        while (!sc.nextLine().equals("stop")) {
//        String s = sc.nextLine();
//        String[] result = s.split(" ");
//
//            String cityes = new ArrayList<>();
//            String countries = new ArrayList<>();
//
//        for (int i = 0; i <= s.length(); i++){
//            countries = result [0];
//            cityes = result[1];
//
//        }
//
//        map.put(countries, cityes);
//    }
//        System.out.println(map);
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, List<String>> itinerary = new HashMap<>();
    String line;

    System.out.println("Please enter country and city: ");

    // Read country and city until typing exit
    while (!(line = scanner.nextLine()).equals("exit")) {
        String[] splittedLine = line.split(" ");
        String country = splittedLine[0];
        String city = splittedLine[1];

        // check if the country has been already added
        if (itinerary.get(country) == null) {
            List<String> cities = new ArrayList<>();
            cities.add(city);
            itinerary.put(country, cities);
        } else {
            if(itinerary.get(country).contains(city)){
                itinerary.get(country).remove(city);
                itinerary.get(country).add(city + " back and forth");
            } else{
                itinerary.get(country).add(city);
            }
        }
    }

    // use utils method to write the map data to a json file
    JsonUtils.writeMapToJsonFile(itinerary, "itinerary.json");
}
}
