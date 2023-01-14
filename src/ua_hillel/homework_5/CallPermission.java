package ua_hillel.homework_5;

public class CallPermission {

    public boolean checkToCall(PersonExtention personExtention) {
        if (personExtention.getStatus() == Balance.have_a_debt.toString())
            return false;
        if (!personExtention.getActivnumber())
            return false;
        else {
            return true;
        }
    }
}
