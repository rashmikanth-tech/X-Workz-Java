package casting;

public class TvParentCast {
    public void cast(TvParent obj) {
        System.out.println("Casting TvParent");
        obj.Display();
        obj.SetupBox();
        obj.Tvtype();
        obj.Sound();
        obj.Channels();
        if(obj instanceof TvParentDetails) {
            TvParentDetails ref = (TvParentDetails)obj;
            ref.extraMethod();
        }
    }
}
