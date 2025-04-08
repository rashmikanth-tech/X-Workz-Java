package casting;

public class GoaParentCast {
    public void cast(GoaParent obj) {
        System.out.println("Casting GoaParent");
        obj.countryInfo();
        obj.stateAnimal();
        obj.stateBird();
        obj.stateSport();
        obj.stateFlower();
        if(obj instanceof GoaParentDetails) {
            GoaParentDetails ref = (GoaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
