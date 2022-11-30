
//接口interFace
public class Pig extends Animal implements Edible {
    public  Pig(){
        super("pig");

    }

    @Override
    public void makeSound() {
        System.out.println("oink!");
    }

    @Override
    public String youMayEat() {
        return "you may eat pork chops";
    }


}
