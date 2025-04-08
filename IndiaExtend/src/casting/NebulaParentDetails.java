package casting;

public class NebulaParentDetails extends NebulaParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in NebulaParentDetails");
    }

    @Override
    public void famousNebula() {
        System.out.println("Overridden: famousNebula in NebulaParentDetails");
    }

    @Override
    public void nebulaTypes() {
        System.out.println("Overridden: nebulaTypes in NebulaParentDetails");
    }

    @Override
    public void nebulaFormation() {
        System.out.println("Overridden: nebulaFormation in NebulaParentDetails");
    }

    @Override
    public void nebulaImportance() {
        System.out.println("Overridden: nebulaImportance in NebulaParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in NebulaParentDetails");
    }
}
