package sanjiv.dp.behavioral.strategy.after1;

public class GoogleMap {


    //Here in this approach facory class will always give the new object which is not required infact.
    public void findPath(String from, String to, TransportationMode mode){
        PathCalculatorStrategy strategy = PathCalculationStrategyFactory.getPathCalculationStrategy(mode);
        strategy.calculatePath(from,to);
    }
}
