
public class Cell implements Button{

    private boolean alive;

    public Cell() {
        alive = false;
    }

    public boolean isAlive(){
        return alive;
    }

    public void press(){
        setState(!alive);
    }

    private void setState(boolean x){
        alive = x;
    }

}
