package abstractfactory.factory.impl;

import abstractfactory.components.Chair;
import abstractfactory.components.Sofa;
import abstractfactory.components.Table;
import abstractfactory.components.impl.victorianfurniture.VictorianChair;
import abstractfactory.components.impl.victorianfurniture.VictorianSofa;
import abstractfactory.components.impl.victorianfurniture.VictorianTable;
import abstractfactory.factory.FurnitureFactoryInterface;

public class VictorianFurnitureFactory implements FurnitureFactoryInterface {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
