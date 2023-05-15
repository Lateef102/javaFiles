package chibuzo;

public class Account {
    private String name;
    private String shape;
    private String type;
    private String address;
    private long number;

    private long phoneNumber;
    private int bvn;
    private int passportNumber;

    Account(String name, String shape, String type, String address, long number, long phoneNumber, int bvn, int passportNumber){
        this.name = name;
        this.shape = shape;
        this.type = type;
        this.address = address;
        this.number = (long) number;
        this.phoneNumber = phoneNumber;
        this.bvn = bvn;
        this.passportNumber = passportNumber;

        }

        public void setName(String name) {

        this.name = name;
        }
        public void setShape(String shape) {
            this.shape = shape;
        }
        public void setType(String type) {
            this.type = type;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public void setNumber( int number) {
            this.number = number;
        }
        public long setPhoneNumber(int passportNumber) {
            return this.phoneNumber;
        }
        public void setBvn(int bvn) {
            this.bvn = bvn;
        }

        public void setPassportNumber(int passportNumber) {
            this.passportNumber = passportNumber;
        }



        public String getName() {
            return name;
        }
        public String getShape(){
        return shape;
        }
        public String getType(){

        return type;
     }
     public String getAddress(){

        return address;
     }
     public long getNumber(){
        return number;
     }
     public long getPhoneNumber(){
        return phoneNumber;
     }
     public int getBvn(){
        return bvn;
    }
    public int getPassportNumber(){
        return passportNumber;
    }

}

