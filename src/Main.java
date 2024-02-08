import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Map<Double, String> newMap = new HashMap<>();

    public static ArrayList<String> cities = new ArrayList<>();
    public static String promptUser(String city){
        System.out.println("Please enter a city. Type END to stop.");
        city = input.nextLine();;
        return city;
    }

    public static void findandPrintAvg(String a) {
        System.out.println("Enter Day 1 Temp for " + a);
        double temp1 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Day 2 Temp for " + a);
        double temp2 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Day 3 Temp for " + a);
        double temp3 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Day 4 Temp for " + a);
        double temp4 = input.nextDouble();
        input.nextLine();
        System.out.println("Enter Day 5 Temp for " + a);
        double temp5 = input.nextDouble();
        input.nextLine();
        double avg = (temp1+temp2+temp3+temp4+temp5)/5;
        System.out.println("The average temperature for " + a + " is " + avg);
        newMap.put(Math.round(avg*100.0)/100.0, a);
    }
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter a city. Type END to stop.");
        String city = input.nextLine();
        while(!(city.equals("END"))) {
            cities.add(city);
            System.out.println(cities);
            System.out.println("Please enter a city. Type END to stop.");
            city = input.nextLine();
        }

        for(String a : cities) {
            findandPrintAvg(a);
        }

        System.out.println(newMap);



    }
}
