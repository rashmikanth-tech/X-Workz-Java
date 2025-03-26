package Inner;

public class Jail {
    private String JailName;
    private String JailLocation;
    private String JailerName;
    private int TotalSell;

    public String getJailName(){
        return JailName;

    }
    public void setJailName(String JailName){
        this.JailerName=JailName;

    }

    public String getJailLocation() {
        return JailLocation;
    }

    public void setJailLocation(String jailLocation) {
        JailLocation = jailLocation;
    }

    public String getJailerName() {
        return JailerName;
    }

    public void setJailerName(String jailerName) {
        JailerName = jailerName;
    }

    public int getTotalSell() {
        return TotalSell;
    }

    public void setTotalSell(int totalSell) {
        TotalSell = totalSell;
    }
}


