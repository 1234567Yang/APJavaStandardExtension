public class APIntNoStringMethod{
    public static int IntAtButAPWithoutStringMethod(int number, int pos){
        int len = IntGetLengthWithoutStringMethod(number);
        int num1 = (int)(number / Math.pow(10, len - (pos))) * 10;//start with 0
        int num2 = (int)(number / Math.pow(10, len - (pos + 1)));
        return num2 - num1;
    }
    public static int IntGetLengthButAPWithoutStringMethod(int number){
        int i = 1;
        while((number = (int)(number / 10)) != 0) i++;
        return i;
    }
}
