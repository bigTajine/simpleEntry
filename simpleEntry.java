import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class simpleEntry {
    public static void main(String[] args) throws ParseException {
        while (true) {
            String[] responseArray = {"Good job!", "Excellent work!", "Great job!", "Keep it up!", "Good work!"};
            String[] extraResponseArray = {"","","",""," You\'re doing good bro.","",""," You\'re a star."};
            String[] kawaiiArray = {" ヾ(＠⌒▽⌒＠)ﾉ"," ヾ｜￣ー￣｜ﾉ"," ╰(◡‿◡✿╰)"," (◕ω◕✿)"," (▰˘◡˘▰)"," (◡‿◡✿)"," （＊＾Ｕ＾）人（≧Ｖ≦＊）/"," ✿◕ ‿ ◕✿"," （ミ￣ー￣ミ）"," ٩(◕‿◕｡)۶"," (* ^ ω ^)"," ＼(￣▽￣)／"," (╯✧▽✧)╯"};
            String amlDate = "01-Jan-1991"; // Literally the most generic date I could think of.
            System.out.println("---------------");    
            Scanner dataInput = new Scanner(System.in);
            System.out.print("C: ");
            String customerID = dataInput.nextLine();
            while (amlDate.isEmpty() == false) {
                System.out.print("D: ");
                amlDate = dataInput.nextLine();
                if (amlDate.isEmpty() == true) {
                    Random randomIndex = new Random();
                    int randomIndexResponse = randomIndex.nextInt(responseArray.length);
                    randomIndex = new Random();
                    int randomIndexExtraResponse = randomIndex.nextInt(extraResponseArray.length);
                    randomIndex = new Random();
                    int randomIndexKawaii = randomIndex.nextInt(kawaiiArray.length);
                    System.out.println("---------------");
                    System.out.println("All done; "+responseArray[randomIndexResponse]+extraResponseArray[randomIndexExtraResponse]+kawaiiArray[randomIndexKawaii]);
                    break;
                }
                Date amlDateParsed=new SimpleDateFormat("dd-MMM-yyyy").parse(amlDate);  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String amlDateConverted = formatter.format(amlDateParsed);
                System.out.println("---------------");
                System.out.println(customerID+"-PhotoID-"+amlDateConverted);
                System.out.println(customerID+"-PhotoID1-"+amlDateConverted);
                System.out.println(customerID+"-Addverification-"+amlDateConverted);
                System.out.println(customerID+"-Addverification1-"+amlDateConverted);
                System.out.println("---------------");
            }
        }
    }
}
