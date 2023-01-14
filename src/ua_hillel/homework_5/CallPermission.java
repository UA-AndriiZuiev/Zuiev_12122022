package ua_hillel.homework_5;
// == Проврка на наличие возможности совершения звонка ==//

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
