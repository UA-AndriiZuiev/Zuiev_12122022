package ua_hillel.homework_6;

public enum Cards {

    MC("MasterCard"),
    SC("SilverCard"),
    GC("GoldCard");
    private final String status;

    Cards(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}