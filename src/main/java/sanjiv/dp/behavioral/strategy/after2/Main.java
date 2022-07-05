package sanjiv.dp.behavioral.strategy.after2;

public class Main {
    public static void main(String[] args) {
        PathCalculationStrategyRegistry registry = new PathCalculationStrategyRegistry();
        CarPathCalculationStrategy carPathCalculationStrategy = new CarPathCalculationStrategy();
        BikePathCalculationStrategy bikePathCalculationStrategy = new BikePathCalculationStrategy();
        WalkPathCalculationStrategy walkPathCalculationStrategy = new WalkPathCalculationStrategy();
        registry.register(TransportationMode.CAR, carPathCalculationStrategy);
        registry.register(TransportationMode.BIKE , bikePathCalculationStrategy);
        registry.register(TransportationMode.WALK, walkPathCalculationStrategy);

        GoogleMap googleMap = new GoogleMap(registry);
        googleMap.findPath("Lucknow", "Delhi", TransportationMode.CAR);

    }
}
