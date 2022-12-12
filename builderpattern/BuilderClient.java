package builderpattern;

import builderpattern.builder.CarWithBuilder;
import builderpattern.builder.components.*;

import java.util.ArrayList;

public class BuilderClient {
    public static void main(String[] args) {

        CarWithBuilder benz = new CarWithBuilder();
        //benz.setSeat  -> not able to access any private properties directly
        //adding few comment to check git 
        /*
        Implementation of Builder pattern Client
         */
        CarWithBuilder safari = CarWithBuilder.builder()
                .setEngine(new Engine("Safari Engine"))
                .setFuel(FuelType.DIESEL)
                .setSeats( new ArrayList<Seat>(4))
                .setWheels( new ArrayList<Wheel>(4))
                .setSteering(new Steering()).build();

        System.out.println(safari.toString());
    }
}
