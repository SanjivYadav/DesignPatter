package sanjiv.dp.prototype;

public class Crow extends Bird{
    private String voice = "kawkaw";
    public Crow(){}

    public Crow(Crow old){
        super(old);
        this.voice = old.voice;
    }
    @Override
    public Crow clone(){
      return new Crow(this);
    }
}
