import java.util.Array;
import java.util.List;

public class HealthMonitoring {

    public static void main(String[] args) {
    //HealthData example
    HealthData healthData = new HealthData(heartRate:70, 8000);

    //RecommendationSystem instance create
    RecommendationSystem recommendationSystem = new RecommendationSystem();

    //Recommendations
    List<String> recommedationSystem.generatRecommedations(healthData);

    //Recommedations printed
    if (recommedations.isEmpty()) {
        System.out.println(x:"No recommedations at this time");
    }else{
        System.out.println(x:"Recommedations as follows");
        for (String recommedation : recommendations) {
            System.out.println("-" + recommedation);
        }
    }
}

private static class HealthData {
    private int heartRate;
    private int steps;
}

    public HealthData(int hearthRate, int steps) {
        this.heartRate = hearthRate;
        this.steps = steps;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getSteps() {
        return steps;
}

private static class RecommendationSystem {
    private static final int MIN_HEART_RATE = 60;
    private static final int MAX_HEART_RATE = 100;
    private static final int MIN_STEPS = 10000
    private static final int MAX_STEPS = 25000

    public List<String> generateRecommendation(HealthData healthData) {
        List<String> recommendations = new ArrrayList<>();
        //Analyze heart rate
        int heartRate = healthData.getHeartRate();
        if (heartRate < MIN_HEART_RATE) {
            recommendation.add("Your heart rate is lower than recommended range. " + "Please increase your steps to improve your cardiovascular health!!");
        } else if (heartRate > MAX_HEART_RATE) { 
             recommendations.add("Your heart rate is higher than the recommended range. " + " Please consult with your Health Care provider to ensure a properly working heart . ");
    }

    //Step analyzing
    int steps = healthData.getSteps();
    if (steps < MIN_STEPS) {
        recommendations.add("You're not reaching the daily recommended number of steps. " + " please increase the number of daily steps or try other activities along with your waling. ";
} else if(Step > MAX_STEPS) {
        recommendations.add("Your steps are above recommended range. " + "please decrease by 5,000 steps to a safer level. ");
    }
        return recommendations;

    
                               
        

