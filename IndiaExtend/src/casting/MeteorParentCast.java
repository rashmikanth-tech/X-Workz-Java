package casting;

public class MeteorParentCast {
    public void cast(MeteorParent obj) {
        System.out.println("Casting MeteorParent");
        obj.category();
        obj.meteorShowers();
        obj.meteorSpeed();
        obj.meteorComposition();
        obj.meteorImpact();
        if(obj instanceof MeteorParentDetails) {
            MeteorParentDetails ref = (MeteorParentDetails)obj;
            ref.extraMethod();
        }
    }
}
