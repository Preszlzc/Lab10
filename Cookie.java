public class Cookie {
  int cookieAmt;
  int cookieTmp;
  int cookieTime;
  boolean cookieDone;

  Cookie() {
    cookieAmt=0;
    cookieTmp=0;
    cookieTime=0;
    cookieDone=false;
  }
  Cookie(int number, int bakeTemp, int bakeTime) {
    cookieAmt = number;
    cookieTmp = bakeTemp;
    cookieTime = bakeTime;
    cookieDone=false;
  }

//Accessor
  boolean isReady() {
    return cookieDone;
  }

//Mutator
public void setCount(int Count) {
  cookieAmt = Count;
}

public void bake(int bakeTemp, int bakeTime){
  cookieTmp = bakeTemp;
  cookieTime = bakeTime;
  System.out.println(cookieAmt + " cookies were baked at " + cookieTmp + " degrees F for " + cookieTime + " minutes.");
  cookieDone = true;
}
}