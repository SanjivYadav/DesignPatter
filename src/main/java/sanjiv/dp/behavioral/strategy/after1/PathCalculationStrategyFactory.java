package sanjiv.dp.behavioral.strategy.after1;


public class PathCalculationStrategyFactory {
    public static PathCalculatorStrategy getPathCalculationStrategy(TransportationMode mode){
        if(mode == TransportationMode.CAR){
            return new CarPathCalculationStrategy();
        }
        else if(mode == TransportationMode.BIKE){
            return new BikePathCalculationStrategy();
        }
        else {
            return new WalkPathCalculationStrategy();
        }
    }
}
