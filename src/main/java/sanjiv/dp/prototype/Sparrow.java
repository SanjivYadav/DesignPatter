package sanjiv.dp.prototype;

public class Sparrow extends Bird{
    private String legType = "Long Leg";

    public Sparrow(){}

    public Sparrow(Sparrow old){
        super(old);
        this.legType = old.legType;
    }

    @Override
    public Sparrow clone(){
        return new Sparrow(this);
    }
}
