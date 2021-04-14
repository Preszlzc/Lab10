public class Sugar extends Cookie {
  String shape;
  boolean isDecorated;
  Sugar(){
    shape = "";
    isDecorated = false;
  }
  Sugar(String passShape){
    shape = passShape;
    isDecorated = false;
  }
  //Mutator
  public void changeShape(String passShape){
    shape = passShape;
  }
  //Accessor
  public String getShape(){
    return shape;
  }
  public void cutShapes(String shapeToCut, int numberToCut) {
    System.out.println(numberToCut + " cookies were cut into " + shapeToCut);
    setCount(numberToCut);
    shape = shapeToCut;
  }
  public void decorate(){
    if(cookieDone==true){
      isDecorated=true;
      System.out.println("The cookies were decorated.");
    }
    else if(cookieDone==false){
      System.out.println("Make sure to bake the cookies first.");
    }
  }
}