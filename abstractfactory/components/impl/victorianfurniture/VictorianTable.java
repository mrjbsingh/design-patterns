package abstractfactory.components.impl.victorianfurniture;

import abstractfactory.components.Table;

public class VictorianTable implements Table {

    @Override
    public void putItem() {
        System.out.println("Use your Victorian Table");
    }

    @Override
    public void displayName() {
        System.out.println("Victorian Table");
    }
}
