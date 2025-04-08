package casting;

public class RiverParentDetails extends RiverParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in RiverParentDetails");
    }

    @Override
    public void longestRiver() {
        System.out.println("Overridden: longestRiver in RiverParentDetails");
    }

    @Override
    public void deepestRiver() {
        System.out.println("Overridden: deepestRiver in RiverParentDetails");
    }

    @Override
    public void riverSource() {
        System.out.println("Overridden: riverSource in RiverParentDetails");
    }

    @Override
    public void riverMouth() {
        System.out.println("Overridden: riverMouth in RiverParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in RiverParentDetails");
    }
}
