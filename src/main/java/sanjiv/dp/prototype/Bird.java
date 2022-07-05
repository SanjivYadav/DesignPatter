package sanjiv.dp.prototype;

public class Bird implements Cloneable{
    private String color;
    private String name;
    private String weight;
    public Bird(){};
    public Bird(Bird old){
        this.color = old.color;
        this.name = old.name;
        this.weight = old.weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public Bird clone() {
        return null;
    }
}
