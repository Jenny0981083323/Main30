public abstract class Animal {
    protected String animalName;
    public Animal(String animalName){
        this.animalName=animalName;

    }
    public void sleep(){
        System.out.println(animalName+"  is sleeping");
    }
    public abstract void makeSound();
}
