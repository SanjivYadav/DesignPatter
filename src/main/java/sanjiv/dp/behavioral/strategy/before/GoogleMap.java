package sanjiv.dp.behavioral.strategy.before;

public class GoogleMap {
    private String fromLocation;
    private String toLocation;

    //This is violating Open/close principle. Its also violating SRP
    public void findPath(String from, String to, TransportationMode mode){
        if(mode == TransportationMode.BIKE){

            //logic to get best route for Bike
        }
        else if(mode == TransportationMode.CAR){
            //logic to get best route for car
        }
        else if(mode == TransportationMode.WALK){
            //logic to get best route for walk
        }
        else{
            //Invalid mode of transportation
        }
    }
}
