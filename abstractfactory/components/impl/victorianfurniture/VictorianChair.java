package abstractfactory.components.impl.victorianfurniture;

import abstractfactory.components.Chair;

public class VictorianChair implements Chair {
    @Override
    public void seat() {
        System.out.println("Victorian chair is ready");
    }
    @Override
    public void displayName() {
        System.out.println("Victorian chair");
    }
}
