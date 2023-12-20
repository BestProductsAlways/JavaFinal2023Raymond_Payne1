public class HealthMonitoringApp {

    private static UserDaoExample userDao = new UserDaoExample();

    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        
        // Uncomment and call test methods in the appropriate order
        // testLoginUser();
        // testDoctorPortal();

        List<User> userList = new ArrayList<>();
        User user1 = new User(5, "Ainee", "Malik", "qmalik@gmail.com", "guggu", false);
        userList.add(user1);

        for (User users : userList) {
            userDao.createUser(users);
        }
    }

    public static boolean loginUser(String email, String password) {
        User user = userDao.getUserByEmail(email);

        if (user != null) {
            // Compare the stored hashed password with the given password and return result
        }

        return false;
    }

    public static void testDoctorPortal() {
        // Implement test code for doctor portal functionalities
    }

    public static void testLoginUser() {
        // Implement test code for login user functionality
    }
}

public class HealthData {
    private int id;
    private int userId;
    private double weight;
    private double height;
    private int steps;
    private int heartRate;
    private String date;

    public HealthData(int id, int userId, double weight, double height, int steps, int heartRate, String date) {
        this.id = id;
        this.userId = userId;
        this.weight = weight;
        this.height = height;
        this.steps = steps;
        this.heartRate = heartRate;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getSteps() {
        return steps;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

        

