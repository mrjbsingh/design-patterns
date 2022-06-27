package abstractfactory.factory;

import abstractfactory.factory.impl.ModernFurnitureFactory;
import abstractfactory.factory.impl.VictorianFurnitureFactory;

import java.util.Locale;

public class FurnitureFactory {
    public FurnitureFactoryInterface getFurnitureFactory(String designType){
        switch (designType.toUpperCase()){
            case "MODERN" :
                return new ModernFurnitureFactory();
            case "VICTORIAN" :
                return new VictorianFurnitureFactory();
            default:
                throw new RuntimeException("Not a valid type of factory");
        }
    }
}
