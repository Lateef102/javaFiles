package chibuzo;






public class GetterAndSetter {
    private String name;
    private String color;
    private String shape;
    private int age;


public GetterAndSetter (String name, String color, String shape, int age) {
 this.name = name;
 this.color = color;
 this.shape = shape;
 this.age = age;
}

 public void setName(String name) {
 this.name = name;
 };

 public void setShape(String shape){
  this.shape = shape;
 }

 public String getColor() {
  return color;
 }
 public String getShape() {
  return shape;
 }

  public int getAge(){
   return age;
  }

 public void setColor(String color) {
  this.color = color;
 }

 public String getName() {
  return name;
 }

}