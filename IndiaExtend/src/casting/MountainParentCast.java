package casting;

public class MountainParentCast {
    public void cast(MountainParent obj) {
        System.out.println("Casting MountainParent");
        obj.category();
        obj.highestPeak();
        obj.mountainRange();
        obj.climate();
        obj.famousTrek();
        if(obj instanceof MountainParentDetails) {
            MountainParentDetails ref = (MountainParentDetails)obj;
            ref.extraMethod();
        }
    }
}
