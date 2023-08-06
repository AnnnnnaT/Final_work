
public class Counter implements AutoCloseable{

  private int val = 1;
  private boolean resourceClosed = false;

  public void add() throws IllegalStateException{
    if(resourceClosed){
      throw new IllegalStateException("Counter was outside of resiurce try");
    }else{
      this.val+=1;
    }
  }

  public void close(){
    resourceClosed = true;
  }

}
