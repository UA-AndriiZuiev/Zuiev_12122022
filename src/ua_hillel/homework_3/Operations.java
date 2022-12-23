package homework_3;

public class Operations {
    public static void main(String[] args) {
    //-------------------------------------------------//
        int number = 5;
        Operations operations = new Operations();
        operations.checkOddEven(number);
        System.out.println("BYE");
    //-------------------------------------------------//
        operations.printMonthInWord_1(number);
        operations.printMonthInWord_2(number+1);
    //-------------------------------------------------//
        operations.magnitude();
    //-------------------------------------------------//
        operations.triangle();
    }

    public void checkOddEven(int a){
        if ((a % 2) == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    public void printMonthInWord_1(int a){
        String result;

        if(a==1)
            result = "JAN";
        else if(a==2)
            result = "FEB";
        else if(a==3)
            result = "MAR";
        else if(a==4)
            result = "APR";
        else if(a==5)
            result = "MAY";
        else if(a==6)
            result = "JUN";
        else if(a==7)
            result = "JUL";
        else if(a==8)
            result = "AUG";
        else if(a==9)
            result = "SEP";
        else if(a==10)
            result = "OCT";
        else if(a==11)
            result = "NOV";
        else if(a==12)
            result = "DEC";
        else
            result = "Not a valid month";
        System.out.println(result);
    }

    public void printMonthInWord_2(int a){
        String result;
        switch (a) {
            case 1:
                result = "JAN";
                break;
            case 2:
                result = "FAB";
                break;
            case 3:
                result = "MAR";
                break;
            case 4:
                result = "APR";
                break;
            case 5:
                result = "MAY";
                break;
            case 6:
                result = "JUN";
                break;
            case 7:
                result = "JUL";
                break;
            case 8:
                result = "AUG";
                break;
            case 9:
                result = "SEP";
                break;
            case 10:
                result = "OCT";
                break;
            case 11:
                result = "NOV";
                break;
            case 12:
                result = "DEC";
                break;
            default:
                result = "Not a valid month";
        }
        System.out.println(result);
    }

    public void magnitude (){
        int a = 3;
        int b = -9;
        int result;
        if (Math.abs(a) > Math.abs(b))
            System.out.println("Число " + a + " має велику величину");
        else if (Math.abs(a) < Math.abs(b))
            System.out.println("Число " + b + " має велику величину");
        else
            System.out.println("Числа " + a + " и " + b + " мають однакову величину");

    }

    public void triangle(){
        int a = 4;
        int b = 8;
        int c = 4;

        if(a==b || a==c || a==c)
           System.out.println("Трикутник рівнобедрений");
        else
           System.out.println("Трикутник  нерівнобедрений");
    }
}