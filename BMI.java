public class BMI {
    // attributes
    private String name;
    private double height;
    private int weight;

    // default constructor
    public BMI(String name, double height, int weight){
        name = "anonymous";
        height = 1.75;
        weight = 80;
    }

    // specific constructor
    public BMI(String name, double height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
