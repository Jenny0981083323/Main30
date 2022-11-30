

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog1=new Dog();
        Dog dog2=new Dog();
        Edible food=new Pig();
        Edible food2=new Tomato("tomato");

        System.out.println(dog1.animalName);
        dog2.sleep();
        //抽象類別
        dog1.makeSound();
        //接口
        System.out.println(food.youMayEat());
        System.out.println(food2.youMayEat());
    }
}
