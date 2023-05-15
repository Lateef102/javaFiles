package chibuzo;

import java.util.Scanner;

public class NokiaMenu {
    public static void main(String[] args) {
        Scanner slang = new Scanner(System.in);
        System.out.println("press 1 for Phone book");
        System.out.println(" press 2 for Message");
        System.out.println(" press 3 for Chat");
        System.out.println(" press 4 for Call register");
        System.out.println(" press 5 for tone");
        System.out.println("press 6 for Settings");
        System.out.println(" press 7 for Call divert");
        System.out.println(" press 8 for games");
        System.out.println(" press 9 for Calculator");
        System.out.println(" press 10 for Reminder");
        System.out.println(" press 11 for Clock");
        System.out.println("press 12 for Profile");
        System.out.println(" press 13 for Sim services");


        int NokiaMenu = slang.nextInt();

switch (NokiaMenu) {
    case 1:
        System.out.println(" Phonebook");
        int Phonebook = slang.nextInt();
        switch (Phonebook) {
            case 1:
                System.out.println("Search");
            case 2:
                System.out.println("Service Nos.");

            case 3:
                System.out.println("Add name");
            case 4:
                System.out.println("Erase");

            case 5:
                System.out.println("Edit");

            case 6:
                System.out.println("Assign tone");

            case 7:
                System.out.println("Send b'card");

            case 8:
                System.out.println("Option");


                int Option = slang.nextInt();
                switch (Option) {
                    case 1:
                        System.out.println("Type my view");

                    case 2:
                        System.out.println("Memory status");


                }
            case 9:
                System.out.println("Speed dails");

            case 10:
                System.out.println("Voice tag");




        }

    case 2:
        System.out.println(" Message");
        int Message = slang.nextInt();
        switch (Message) {
            case 1:
                System.out.println("Write messages");

            case 2:
                System.out.println("Inbox");

            case 3:
                System.out.println("Outbox");

            case 4:
                System.out.println("Picture messages");
                System.out.println("press 1 for Search");
                System.out.println("Search");

            case 5:
                System.out.println(" Templates");
            case 6:
                System.out.println("Smileys");
            case 7:
                System.out.println("Messagesettings");


                int Messagesetting = slang.nextInt();
                switch (Messagesetting) {
                    case 1:
                        System.out.println(" Set1");

                        int set1 = slang.nextInt();
                        switch (set1) {
                            case 1:
                                System.out.println("Message centre number");
                            case 2:
                                System.out.println("Message sent as");
                            case 3:
                                System.out.println("Message validity");


                                int common = slang.nextInt();
                                switch (common) {
                                    case 1:
                                        System.out.println("Delivery report");
                                    case 2:
                                        System.out.println("Reply via same centre");
                                    case 3:
                                        System.out.println("Character support");

                                }

                            case 8:
                                System.out.println("Info service");
                            case 9:
                                System.out.println("Voice mailbox number");
                            case 10:
                                System.out.println(" Service command editor");


                        }


                }


        }
    case 3:
        System.out.println(" Chat");


    case 4:
        System.out.println("Callregister");

        int Callregister = slang.nextInt();
        switch (Callregister) {
            case 1:
                System.out.println("Missed calls");
            case 2:
                System.out.println("Received call");
            case 3:
                System.out.println("Dailled number");
            case 4:
                System.out.println("Erase recent call lists");
            case 5:
                System.out.println("Showcallduration");



                int Showcallduration = slang.nextInt();
                switch (Showcallduration) {
                    case 1:
                        System.out.println("Last call duration");
                    case 2:
                        System.out.println("All call's duration");
                    case 3:
                        System.out.println("Received  call's duration");
                    case 4:
                        System.out.println("Dailled call's duration");
                    case 5:
                        System.out.println("Clear timers");
                }
            case 6:
                System.out.println("Showcallcost");
                int Showcallcost = slang.nextInt();
                switch (Showcallcost) {
                    case 1:
                        System.out.println("Last call cost");
                    case 2:
                        System.out.println("All call's cost");
                    case 3:
                        System.out.println("Clear counters");
                }
            case 7:
                System.out.println("Callcostsettings");
                int Callcostsettings = slang.nextInt();
                switch (Callcostsettings) {
                    case 1:
                        System.out.println("Call cost limit");
                    case 2:
                        System.out.println("Show cost in");
                }
            case 8:
                System.out.println("Prepaid Credit");
        }

    case 5:
        System.out.println(" Tone");
        int Tone = slang.nextInt();
        switch (Tone) {
            case 1:
                System.out.println("Ringing tone");
            case 2:
                System.out.println("Ringing volume");
            case 3:
                System.out.println("Incoming call alart");
            case 4:
                System.out.println("Composer");
            case 5:
                System.out.println("Message alert tone");
            case 6:
                System.out.println("Key tones");
            case 7:
                System.out.println("Warning and game tones");
            case 8:
                System.out.println("Vibrating alert");
            case 9:
                System.out.println("Screen saver");
        }
    case 6:
        System.out.println(" Settings");
        int Settings = slang.nextInt();
        switch (Settings) {
            case 1:
                System.out.println("Call settings");
            case 2:
                System.out.println("Automatic redial");
            case 3:
                System.out.println("Call waiting options");
            case 4:
                System.out.println("Own number sending");
            case 5:
                System.out.println("Phone line in use");
            case 6:
                System.out.println("Automaticanswer");
        }
        int Automaticanswer = slang.nextInt();
        switch (Automaticanswer) {
            case 1:
                System.out.println("Language");
            case 2:
                System.out.println("Cell info display");
            case 3:
                System.out.println("Welcome note");
            case 4:
                System.out.println("Network selection");
            case 5:
                System.out.println("Light");
            case 6:
                System.out.println("Confirm SIM services actions");

                int Securitysettings = slang.nextInt();
                switch (Securitysettings) {
                    case 1:
                        System.out.println("PIN code request");
                    case 2:
                        System.out.println("Call barring service");
                    case 3:
                        System.out.println("Fixing dailling");
                    case 4:
                        System.out.println("Close user group");
                    case 5:
                        System.out.println("Phone security");
                    case 6:
                        System.out.println("Change access codes");

                    case 7:
                        System.out.println(" Restore factory settings");
                }


        }

    case 7:
        System.out.println(" Call divert");

    case 8:
        System.out.println("Game");
    case 9:
        System.out.println(" Calculator");
    case 10:
        System.out.println("Reminder");
    case 11:
        System.out.println(" Clock");

        int Clock = slang.nextInt();
        switch (Clock) {
            case 1:
                System.out.println("Alarm clock");
            case 2:
                System.out.println("Clock settings");
            case 3:
                System.out.println("Date setting");
            case 4:
                System.out.println("Stopwatch");
            case 5:
                System.out.println("Countdown timer");
            case 6:
                System.out.println("Auto update of date and time");

        }
    case 12:
        System.out.println("Profile");
    case 13:
        System.out.println("Sim services");



}




    }
}
