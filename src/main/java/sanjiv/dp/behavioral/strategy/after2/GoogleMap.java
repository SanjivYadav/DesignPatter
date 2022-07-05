package sanjiv.dp.behavioral.strategy.after2;

public class GoogleMap {
    private PathCalculationStrategyRegistry registry;
    GoogleMap(PathCalculationStrategyRegistry registry){
        this.registry = registry;
    }

    //Here in this approach facory class will always give the new object which is not required infact.
    public void findPath(String from, String to, TransportationMode mode){
        PathCalculatorStrategy strategy = registry.getStrategy(mode);
        strategy.calculatePath(from,to);
    }
}
