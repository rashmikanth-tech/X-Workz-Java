package casting;

public class VolcanoParentDetails extends VolcanoParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in VolcanoParentDetails");
    }

    @Override
    public void mostActiveVolcano() {
        System.out.println("Overridden: mostActiveVolcano in VolcanoParentDetails");
    }

    @Override
    public void highestVolcano() {
        System.out.println("Overridden: highestVolcano in VolcanoParentDetails");
    }

    @Override
    public void eruptionFrequency() {
        System.out.println("Overridden: eruptionFrequency in VolcanoParentDetails");
    }

    @Override
    public void lavaComposition() {
        System.out.println("Overridden: lavaComposition in VolcanoParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in VolcanoParentDetails");
    }
}
