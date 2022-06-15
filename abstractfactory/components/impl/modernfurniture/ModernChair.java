package abstractfactory.components.impl.modernfurniture;

import abstractfactory.components.Chair;

public class ModernChair implements Chair {
    @Override
    public void seat() {
        System.out.println("Using Modern chair to seat");
    }

    @Override
    public void displayName() {
        System.out.println("Modern chair");
    }
}
