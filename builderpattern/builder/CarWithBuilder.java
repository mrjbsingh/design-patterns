package builderpattern.builder;

import builderpattern.builder.components.*;

import java.util.ArrayList;

public class CarWithBuilder {
    //Mandatory properties
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private FuelType fuelType;
    private Steering steering;
    private ArrayList<Seat> seats;

    //Optional properties
    private MusicSystem musicSystem;
    private SunRoof sunRoof;
    private CarCover carCover;

    @Override
    public String toString() {
        return "CarWithBuilder{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", fuelType=" + fuelType +
                ", steering=" + steering +
                ", seats=" + seats +
                ", musicSystem=" + musicSystem +
                ", sunRoof=" + sunRoof +
                ", carCover=" + carCover +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        //Mandatory properties
        private Engine engine;
        private ArrayList<Wheel> wheels;
        private FuelType fuelType;
        private Steering steering;
        private ArrayList<Seat> seats;

        //Optional properties
        private MusicSystem musicSystem;
        private SunRoof sunRoof;
        private CarCover carCover;


        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Builder setFuel(FuelType fuelType) {
            this.fuelType = fuelType;
            return this;
        }

        public Builder setSeats(ArrayList<Seat> seats) {
            this.seats = seats;
            return this;
        }

        public Builder setMusicSystem(MusicSystem musicSystem) {
            this.musicSystem = musicSystem;
            return this;
        }

        public Builder setWheels(ArrayList<Wheel> wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setSunRoof(SunRoof sunRoof) {
            this.sunRoof = sunRoof;
            return this;
        }

        public Builder setCarCover(CarCover carCover) {
            this.carCover = carCover;
            return this;
        }

        public Builder setSteering(Steering steering) {
            this.steering = steering;
            return this;
        }

        public CarWithBuilder build(){
            if(engine == null || steering == null || fuelType == null || wheels == null || seats == null){
                throw new RuntimeException("Mandatory Fields are not set");
            }

            CarWithBuilder car = new CarWithBuilder();
            car.engine = this.engine;
            car.wheels = this.wheels;
            car.steering = this.steering;
            car.seats = this.seats;
            car.fuelType = this.fuelType;
            car.sunRoof = this.sunRoof;
            car.musicSystem = this.musicSystem;

            return car;
        }
    }
}
