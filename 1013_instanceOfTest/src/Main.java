
class Animal {
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public void fetch(){
        System.out.println("Dog is fetching a ball");
    }
}

class Cat extends Animal {
    public void makeSound(){
        System.out.println("Cat meows");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        Animal animal3 = new Animal();
        System.out.println(animal1 instanceof Dog);
        System.out.println(animal1 instanceof Cat);

        Animal animal = new Dog();
        //Dynamic Binding
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.fetch();

        }
        else if (animal2 instanceof Cat) {
            System.out.println("Cat cannot fetch!");
        }
    }
}