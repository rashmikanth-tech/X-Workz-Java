package casting;

public class QuasarParentDetails extends QuasarParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in QuasarParentDetails");
    }

    @Override
    public void quasarEnergySource() {
        System.out.println("Overridden: quasarEnergySource in QuasarParentDetails");
    }

    @Override
    public void brightestQuasar() {
        System.out.println("Overridden: brightestQuasar in QuasarParentDetails");
    }

    @Override
    public void quasarRedshift() {
        System.out.println("Overridden: quasarRedshift in QuasarParentDetails");
    }

    @Override
    public void quasarDiscovery() {
        System.out.println("Overridden: quasarDiscovery in QuasarParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in QuasarParentDetails");
    }
}
