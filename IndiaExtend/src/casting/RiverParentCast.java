package casting;

public class RiverParentCast {
    public void cast(RiverParent obj) {
        System.out.println("Casting RiverParent");
        obj.category();
        obj.longestRiver();
        obj.deepestRiver();
        obj.riverSource();
        obj.riverMouth();
        if(obj instanceof RiverParentDetails) {
            RiverParentDetails ref = (RiverParentDetails)obj;
            ref.extraMethod();
        }
    }
}
