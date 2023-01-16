package ua_hillel.homework_5;
// == Проврка на наличие возможности совершения звонка ==//

public class CallPermission {

    public static boolean checkToCall(PersonExtention personExtention) {
        if (personExtention.getStatus() == Balance.HAVE_A_DEBT.toString())
            return false;
        if (!personExtention.getActivnumber())
            return false;
        else {
            return true;
        }
    }
}
