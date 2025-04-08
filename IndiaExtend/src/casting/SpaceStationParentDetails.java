package casting;

public class SpaceStationParentDetails extends SpaceStationParent {
    @Override
    public void category() {
        System.out.println("Overridden: category in SpaceStationParentDetails");
    }

    @Override
    public void firstSpaceStation() {
        System.out.println("Overridden: firstSpaceStation in SpaceStationParentDetails");
    }

    @Override
    public void largestSpaceStation() {
        System.out.println("Overridden: largestSpaceStation in SpaceStationParentDetails");
    }

    @Override
    public void spaceStationOrbit() {
        System.out.println("Overridden: spaceStationOrbit in SpaceStationParentDetails");
    }

    @Override
    public void spaceStationPurpose() {
        System.out.println("Overridden: spaceStationPurpose in SpaceStationParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in SpaceStationParentDetails");
    }
}
