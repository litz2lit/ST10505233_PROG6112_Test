public class GamingConsoleReport {
    public static void main(String[] args) {
        // Single-dimensional array for cities[cite: 3, 4]
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        // Two-dimensional array for sales: {PS5, XBOX, SWITCH}[cite: 3, 4]
        int[][] sales = {
                {1000, 2000, 3000}, // Cape Town[cite: 3, 4]
                {2000, 3000, 4000}, // Port Elizabeth[cite: 3, 4]
                {1500, 1100, 1200}  // Pretoria[cite: 3, 4]
        };

        // Displaying the Gaming Console Report[cite: 3, 4]
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = -1;
        String topCity = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = sales[i][0] + sales[i][1] + sales[i][2];
            System.out.printf("%-20s %-10d%n", cities[i], cityTotal);

            // Track the city with the most sales[cite: 3, 4]
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }
}