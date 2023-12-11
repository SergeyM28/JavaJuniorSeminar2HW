public class Cat extends Animal{

    private int speed; // speed from 1 to 10
    private String voice = "meow";
    public boolean fed = false;

    @Override
    public void feed(){
        if (!fed){
            System.out.println(this.getName() + " comes in " + 10 / speed + " seconds");
            makeSound();
            this.fed = true;
        } else {
            System.out.println("nothing happens");
        }
    }

    @Override
    void makeSound() {
        System.out.println(this.getName() + " says " + this.voice);
    }

    public Cat(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getVoice() {
        return voice;
    }

    public boolean isFed() {
        return fed;
    }
}
