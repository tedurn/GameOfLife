
public class Cell implements Button{

    private boolean isAlive;

    public Cell(boolean isAlive) {
        isAlive = false;
    }

    public void press(){
        setState(!isAlive);
    }

    private void setState(boolean x){
        isAlive = x;
    }

}
