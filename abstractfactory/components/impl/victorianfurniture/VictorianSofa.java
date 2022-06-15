package abstractfactory.components.impl.victorianfurniture;

import abstractfactory.components.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void useSofa() {
        System.out.println("Seat on Victorian Sofa");
    }
    @Override
    public void displayName() {
        System.out.println("Victorian Sofa");
    }
}
