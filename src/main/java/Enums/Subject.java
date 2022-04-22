package Enums;

public enum Subject {
    B("Baile"),
    BOX("Boxeo"),
    C("Crossfit"),
    N("Natacion"),
    S("Spinning");

    private final String desc;
    Subject(String desc){this.desc = desc;}

    public String getDesc() {
        return desc;
    }
}
