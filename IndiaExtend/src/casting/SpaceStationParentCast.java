package casting;

public class SpaceStationParentCast {
    public void cast(SpaceStationParent obj) {
        System.out.println("Casting SpaceStationParent");
        obj.category();
        obj.firstSpaceStation();
        obj.largestSpaceStation();
        obj.spaceStationOrbit();
        obj.spaceStationPurpose();
        if(obj instanceof SpaceStationParentDetails) {
            SpaceStationParentDetails ref = (SpaceStationParentDetails)obj;
            ref.extraMethod();
        }
    }
}
