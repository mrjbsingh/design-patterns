package abstractfactory.components.impl.modernfurniture;

import abstractfactory.components.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void useSofa() {
        System.out.println("Your Modern Sofa is ready");
    }

    @Override
    public void displayName() {
        System.out.println("Modern Sofa");
    }
}
