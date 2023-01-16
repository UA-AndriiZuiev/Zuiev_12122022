package ua_hillel.homework_5;
// ===== Предоставление информации о причинах невозможности совершить звонок ==== //

public class CheckProblemCall {

    public static String checkProblemCall(PersonExtention personExtention) {
        String status = null;
        if (!personExtention.getActivnumber()) {
            status = "Номер заблоковано.";
        }
        if (personExtention.getStatus() == Balance.HAVE_A_DEBT.toString()) {
            if (status != null)
                status += " На рахунку недостатньо коштiв.";
            else {
                status = "На рахунку недостатньо коштiв.";
            }
        }
        if (status == null)
            status = "Проблем iз абонентом не виявлено.";
        return status;
    }
}