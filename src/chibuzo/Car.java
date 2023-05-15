package chibuzo;

public class Car {
    public static void main(String[] args) {
        GetterAndSetter car1 = new GetterAndSetter("skillful", "black",
                "tall", 60);


        car1.setName("mechanic");
        car1.setName("Ijogbon");
        car1.setShape("tall");
        car1.setColor("blue");
        System.out.println("my shape is " + car1.getShape());
        System.out.println("my name is " + car1. getName());

        System.out.println(" my color is " + car1.getColor());
        System.out.println("my age is " + car1.getAge());


    }
}
