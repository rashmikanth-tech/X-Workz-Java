package casting;

public class MountainParentDetails extends MountainParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in MountainParentDetails");
    }

    @Override
    public void highestPeak() {
        System.out.println("Overridden: highestPeak in MountainParentDetails");
    }

    @Override
    public void mountainRange() {
        System.out.println("Overridden: mountainRange in MountainParentDetails");
    }

    @Override
    public void climate() {
        System.out.println("Overridden: climate in MountainParentDetails");
    }

    @Override
    public void famousTrek() {
        System.out.println("Overridden: famousTrek in MountainParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in MountainParentDetails");
    }
}
