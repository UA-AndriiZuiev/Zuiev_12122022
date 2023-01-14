package ua_hillel.homework_5;
// ===== Предоставление информации о причинах невозможности совершить звонок ==== //

public class CheckProblemCall {
    private String status = null;
    public String checkProblemCall(PersonExtention personExtention) {
        if (!personExtention.getActivnumber()) {
            status = "Номер заблоковано.";
        }
        if (personExtention.getStatus() == Balance.have_a_debt.toString()) {
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