package abstractfactory.factory;

import abstractfactory.components.Chair;
import abstractfactory.components.Sofa;
import abstractfactory.components.Table;

public interface FurnitureFactoryInterface {
    public Chair createChair();
    public Table createTable();
    public Sofa createSofa();
}
