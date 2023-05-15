package chibuzo;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account ("Mariam", "square", "savings", "156 Maltzan street pretoria west south africa",
                879 ,66488848, 5558372,  03);
        account1.setName("SKILLFULNESS");
        account1.setShape("SQUARE");
        account1.setType(" SAVING");
        account1.setAddress("156 MALTZAN STREET PRETORIA WEST SOUTH AFRICA");
        account1.setNumber(879);
        account1.setPhoneNumber( 66488848);
        account1.setBvn(5558372);
        account1.setPassportNumber(03);

        System.out.println("My name is" + account1.getName());
        System.out.println("My shape is" + account1.getShape());
        System.out.println("My saving is" + account1.getType());
        System.out.println("Address is" + account1.getAddress());
        System.out.println("The number is" + account1.getNumber());
        System.out.println("The phoneNumber is " + account1.getPhoneNumber());
        System.out.println("The bnvNumber is " + account1.getBvn());
        System.out.println(" The passPortNumber is " + account1.getPassportNumber());



    }
}
