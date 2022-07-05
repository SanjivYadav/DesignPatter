package sanjiv.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();
        Bird bird = new Bird();
        bird.setColor("white");
        bird.setName("General Bird");
        bird.setWeight("20");

        Crow c = new Crow();
        Sparrow sp = new Sparrow();
        birds.add(bird);
        birds.add(c);
        birds.add(sp);

        System.out.println("Create Copy");
        List<Bird> children = new ArrayList<>();
        for(Bird b : birds){
            children.add(b.clone());
        }

        System.out.println("Now children are the copy of parent");
    }
}
