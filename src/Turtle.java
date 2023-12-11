public class Turtle extends Animal{
    private int speed; // speed from 1 to 10
    public boolean fed = false;

    @Override
    public void feed(){
        if (!fed){
            System.out.println(this.getName() + " comes in " + 1000 / speed + " seconds");
            makeSound();
            this.fed = true;
        } else {
            System.out.println("nothing happens");
        }
    }

    @Override
    void makeSound() {
        System.out.println(this.getName() + " remains still");
    }

    public Turtle(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFed() {
        return fed;
    }
}
