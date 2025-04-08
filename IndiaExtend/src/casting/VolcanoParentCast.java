package casting;

public class VolcanoParentCast {
    public void cast(VolcanoParent obj) {
        System.out.println("Casting VolcanoParent");
        obj.category();
        obj.mostActiveVolcano();
        obj.highestVolcano();
        obj.eruptionFrequency();
        obj.lavaComposition();
        if(obj instanceof VolcanoParentDetails) {
            VolcanoParentDetails ref = (VolcanoParentDetails)obj;
            ref.extraMethod();
        }
    }
}
