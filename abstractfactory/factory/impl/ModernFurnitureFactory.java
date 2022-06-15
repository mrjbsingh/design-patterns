package abstractfactory.factory.impl;

import abstractfactory.components.Chair;
import abstractfactory.components.Sofa;
import abstractfactory.components.Table;
import abstractfactory.components.impl.modernfurniture.ModernChair;
import abstractfactory.components.impl.modernfurniture.ModernSofa;
import abstractfactory.components.impl.modernfurniture.ModernTable;
import abstractfactory.factory.FurnitureFactoryInterface;

public class ModernFurnitureFactory implements FurnitureFactoryInterface {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
