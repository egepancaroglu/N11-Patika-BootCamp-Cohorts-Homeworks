import service.BuildManager;
import service.BuildService;
import service.BuildServiceImpl;

/**
 * @author egepancaroglu
 */

public class Main {

    public static void main(String[] args) {

        BuildManager buildManager = new BuildManager();

        BuildService buildService = new BuildServiceImpl(buildManager);

        System.out.printf("Total Price of Houses: %,.2f\u20BA%n", buildService.totalPriceOfAllHouses());
        System.out.printf("Total Price of Villas: %,.2f\u20BA%n", buildService.totalPriceOfAllVillas());
        System.out.printf("Total Price of Summer Cottages: %,.2f\u20BA%n", buildService.totalPriceOfAllSummerCottages());
        System.out.printf("Total Price of Builds: %,.2f\u20BA%n", buildService.totalPriceOfAllBuilds());

        System.out.printf("Average Area of Houses: %,.2f\u33A1%n", buildService.averageAreaOfAllHouses());
        System.out.printf("Average Area of Villa: %,.2f\u33A1%n", buildService.averageAreaOfAllVillas());
        System.out.printf("Average Area of Summer Cottages: %,.2f\u33A1%n", buildService.averageAreaOfAllSummerCottages());
        System.out.printf("Average Area of Builds: %,.2f\u33A1%n", buildService.averageAreaOfAllBuilds());

        System.out.println("Filter by Room Count : 3 and Hall Count : 2 -> " + buildService.FilterByNumberOfRoomAndHall(3,2));



    }
}