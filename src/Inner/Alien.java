package Inner;

public class Alien {
    private String SeenBy;
    private String SeenDate;
    private String Describe;

    public String getSeenBy(){
        return  SeenBy;
    }

    public void setSeenBy(String seenBy) {
        SeenBy = seenBy;
    }

    public void setSeenDate(String seenDate) {
        SeenDate = seenDate;
    }

    public String getSeenDate() {
        return SeenDate;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String describe) {
        this.Describe = describe;
    }
}
