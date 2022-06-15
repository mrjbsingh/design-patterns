package abstractfactory.components.impl.modernfurniture;

import abstractfactory.components.Table;

public class ModernTable implements Table {

    @Override
    public void putItem() {
        System.out.println("Use your Modern Table");
    }

    @Override
    public void displayName() {
        System.out.println("Modern Table");
    }
}
