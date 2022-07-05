package sanjiv.dp.behavioral.strategy.after2;

public class BikePathCalculationStrategy implements PathCalculatorStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("Best path for Bike");
    }
}
