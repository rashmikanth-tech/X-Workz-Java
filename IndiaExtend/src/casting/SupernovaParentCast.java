package casting;

public class SupernovaParentCast {
    public void cast(SupernovaParent obj) {
        System.out.println("Casting SupernovaParent");
        obj.category();
        obj.typesOfSupernovae();
        obj.supernovaBrightness();
        obj.supernovaFormation();
        obj.elementsFromSupernova();
        if(obj instanceof SupernovaParentDetails) {
            SupernovaParentDetails ref = (SupernovaParentDetails)obj;
            ref.extraMethod();
        }
    }
}
