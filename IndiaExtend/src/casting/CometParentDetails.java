package casting;

public class CometParentDetails extends CometParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in CometParentDetails");
    }

    @Override
    public void famousComet() {
        System.out.println("Overridden: famousComet in CometParentDetails");
    }

    @Override
    public void cometTailFormation() {
        System.out.println("Overridden: cometTailFormation in CometParentDetails");
    }

    @Override
    public void cometOrbit() {
        System.out.println("Overridden: cometOrbit in CometParentDetails");
    }

    @Override
    public void cometComposition() {
        System.out.println("Overridden: cometComposition in CometParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in CometParentDetails");
    }
}
