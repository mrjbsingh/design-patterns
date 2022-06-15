package abstractfactory;

import abstractfactory.components.Furniture;
import abstractfactory.factory.FurnitureFactory;
import abstractfactory.factory.FurnitureFactoryInterface;

import java.util.ArrayList;

public class ClientAbstractFactory {
    public static void main(String[] args) {

        FurnitureFactory furnitureFactory = new FurnitureFactory();

        FurnitureFactoryInterface modernFactory = furnitureFactory.getFurnitureFactory("Modern");

        FurnitureFactoryInterface victorianFactory = furnitureFactory.getFurnitureFactory("victorian");

        ArrayList<Furniture> furnitureStore = new ArrayList<>();
        furnitureStore.add(modernFactory.createChair());
        furnitureStore.add(modernFactory.createSofa());
        furnitureStore.add(modernFactory.createTable());
        furnitureStore.add(victorianFactory.createTable());
        furnitureStore.add(victorianFactory.createChair());
        furnitureStore.add(victorianFactory.createSofa());

        for(Furniture furniture: furnitureStore){
            furniture.displayName();
        }

    }
}
