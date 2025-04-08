package casting;

public class TvParentDetails extends TvParent {
    @Override
    public void Display() {
        System.out.println("Overridden: Display in TvParentDetails");
    }

    @Override
    public void SetupBox() {
        System.out.println("Overridden: SetupBox in TvParentDetails");
    }

    @Override
    public void Tvtype() {
        System.out.println("Overridden: Tvtype in TvParentDetails");
    }

    @Override
    public void Sound() {
        System.out.println("Overridden: Sound in TvParentDetails");
    }

    @Override
    public void Channels() {
        System.out.println("Overridden: Channels in TvParentDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in TvParentDetails");
    }
}
