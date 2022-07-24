from datetime import datetime
import random

def CD_script():
    Kawaii_List = [' ヾ(＠⌒▽⌒＠)ﾉ',' ヾ｜￣ー￣｜ﾉ',' ╰(◡‿◡✿╰)',' (◕ω◕✿)',' (▰˘◡˘▰)',' (◡‿◡✿)',' （＊＾Ｕ＾）人（≧Ｖ≦＊）/',' ✿◕ ‿ ◕✿',' （ミ￣ー￣ミ）',' ٩(◕‿◕｡)۶',' (* ^ ω ^)',' ＼(￣▽￣)／',' (╯✧▽✧)╯']
    Response_List = ['Good job!', 'Excellent work!', 'Great job!', 'Keep it up!', 'Good work!']
    Extra_Response_List = ['','','','',' You\'re doing good bro.','','',' You\'re a star.']
    print('---------------')
    Customer_ID = input("C: ")
    AML_Date = input("D: ")
    AML_Date_Converted = datetime.strptime(AML_Date, '%d-%b-%Y').date()
    AML_Date_Converted = AML_Date_Converted.strftime("%Y%m%d")
    print('---------------')
    print(str(Customer_ID)+'-PhotoID-'+str(AML_Date_Converted))
    print(str(Customer_ID)+'-PhotoID1-'+str(AML_Date_Converted))
    print(str(Customer_ID)+'-Addverification-'+str(AML_Date_Converted))
    print(str(Customer_ID)+'-Addverification1-'+str(AML_Date_Converted))
    print('---------------')
    while AML_Date != None:
        AML_Date = input("D: ")
        if AML_Date == "":
            print('---------------')
            print('All done; '+random.choice(Response_List)+random.choice(Extra_Response_List)+random.choice(Kawaii_List))
            CD_script()
        AML_Date_Converted = datetime.strptime(AML_Date, '%d-%b-%Y').date()
        AML_Date_Converted = AML_Date_Converted.strftime("%Y%m%d")
        print('---------------')
        print(str(Customer_ID)+'-PhotoID-'+str(AML_Date_Converted))
        print(str(Customer_ID)+'-PhotoID1-'+str(AML_Date_Converted))
        print(str(Customer_ID)+'-Addverification-'+str(AML_Date_Converted))
        print(str(Customer_ID)+'-Addverification1-'+str(AML_Date_Converted))
        print('---------------')
if __name__ == "__main__":
   CD_script()