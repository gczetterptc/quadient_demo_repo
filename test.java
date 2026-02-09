import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AnalyticsDashboard {

    // Fake analytics generator
    public static Map<String, Object> generateDashboardMetrics() {
        Map<String, Object> dashboard = new HashMap<>();
        Random random = new Random();

        dashboard.put("totalUsers", 12000 + random.nextInt(3000));
        dashboard.put("activeUsers", 4000 + random.nextInt(1500));
        dashboard.put("conversionRate", 2.5 + random.nextDouble() * 2);
        dashboard.put("bounceRate", 35 + random.nextInt(20));
        dashboard.put("averageSessionTimeMinutes", 3 + random.nextInt(5));
        dashboard.put("revenueToday", 5000 + random.nextInt(4000));

        Map<String, Integer> trafficSources = new HashMap<>();
        trafficSources.put("Organic", 45);
        trafficSources.put("Paid Ads", 25);
        trafficSources.put("Social Media", 20);
        trafficSources.put("Referral", 10);

        dashboard.put("trafficSources", trafficSources);

        return dashboard;
    }

    // Demo runner
    public static void main(String[] args) {
        Map<String, Object> dashboard = generateDashboardMetrics();
        dashboard.forEach((key, value) ->
                System.out.println(key + " : " + value)

                          // Demo.java
public class Demo {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        Demo demo = new Demo();
        demo.sayHello("World");
        demo.addNumbers(5, 7);
    }

    // A simple method
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Another demo method
    public int addNumbers(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
Changes

UI FIXES
