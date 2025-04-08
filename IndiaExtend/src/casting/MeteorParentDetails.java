package casting;

public class MeteorParentDetails extends MeteorParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in MeteorParentDetails");
    }

    @Override
    public void meteorShowers() {
        System.out.println("Overridden: meteorShowers in MeteorParentDetails");
    }

    @Override
    public void meteorSpeed() {
        System.out.println("Overridden: meteorSpeed in MeteorParentDetails");
    }

    @Override
    public void meteorComposition() {
        System.out.println("Overridden: meteorComposition in MeteorParentDetails");
    }

    @Override
    public void meteorImpact() {
        System.out.println("Overridden: meteorImpact in MeteorParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MeteorParentDetails");
    }
}
