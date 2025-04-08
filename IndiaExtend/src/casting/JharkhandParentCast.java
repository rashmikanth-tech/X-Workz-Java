package casting;

public class JharkhandParentCast {
    public void cast(JharkhandParent obj) {
        System.out.println("Casting JharkhandParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof JharkhandParentDetails) {
            JharkhandParentDetails ref = (JharkhandParentDetails)obj;
            ref.extraMethod();
        }
    }
}
