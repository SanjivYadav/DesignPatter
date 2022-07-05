package sanjiv.dp.behavioral.strategy.after2;

import java.util.HashMap;
import java.util.Map;

public class PathCalculationStrategyRegistry {
    Map<TransportationMode, PathCalculatorStrategy> map = new HashMap<TransportationMode, PathCalculatorStrategy>();

    public void register(TransportationMode mode, PathCalculatorStrategy strategy){
        map.put(mode, strategy);
    }

    public PathCalculatorStrategy getStrategy(TransportationMode mode){
        return map.get(mode);
    }
}
