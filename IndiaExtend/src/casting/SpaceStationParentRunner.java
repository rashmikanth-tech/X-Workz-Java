package casting;

public class SpaceStationParentRunner {
    public static void main(String[] args) {

        SpaceStationParent obj1 = new SpaceStationParent();
        obj1.category();
        obj1.firstSpaceStation();
        obj1.largestSpaceStation();
        obj1.spaceStationOrbit();
        obj1.spaceStationPurpose();
        System.out.println("----------------------");

        SpaceStationParent obj2 = new SpaceStationParentDetails();
        obj2.category();
        obj2.firstSpaceStation();
        obj2.largestSpaceStation();
        obj2.spaceStationOrbit();
        obj2.spaceStationPurpose();
        System.out.println("----------------------");

        SpaceStationParentDetails obj3 = new SpaceStationParentDetails();
        obj3.category();
        obj3.firstSpaceStation();
        obj3.largestSpaceStation();
        obj3.spaceStationOrbit();
        obj3.spaceStationPurpose();
        obj3.extraMethod();
        System.out.println("----------------------");

        SpaceStationParentCast caster = new SpaceStationParentCast();
        caster.cast(obj2);
    }
}
