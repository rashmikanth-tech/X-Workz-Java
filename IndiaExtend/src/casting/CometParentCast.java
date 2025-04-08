package casting;

public class CometParentCast {
    public void cast(CometParent obj) {
        System.out.println("Casting CometParent");
        obj.category();
        obj.famousComet();
        obj.cometTailFormation();
        obj.cometOrbit();
        obj.cometComposition();
        if(obj instanceof CometParentDetails) {
            CometParentDetails ref = (CometParentDetails)obj;
            ref.extraMethod();
        }
    }
}
