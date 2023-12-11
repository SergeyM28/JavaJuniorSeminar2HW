/*      Создайте абстрактный класс "Animal" с полями "name" и "age".
        Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
        Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
        Выведите на экран информацию о каждом объекте.
        Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
**/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat("Vasia", 5, 5);
        Turtle turtle = new Turtle("Piter", 50, 5);
        List <Animal> animals = Arrays.asList(cat, turtle);

        for (Animal elem: animals) {
            Class<?> tempClass = Class.forName(elem.getClass().getName());
            System.out.println("Class name: " + tempClass.getSimpleName());

            Constructor<?>[] constructor = tempClass.getConstructors();
            System.out.println("Constructors: ");
            for (Constructor constr : constructor) {
                System.out.println(constr.toString());
            }

            Field[] fields = tempClass.getDeclaredFields();
            System.out.println("Fields: ");
            for (Field field : fields) {
                System.out.println(field.toString());
            }

            Method[] methods = tempClass.getDeclaredMethods();
            System.out.println("Methods: ");
            for (Method method : methods) {
                System.out.println(method.getName());
                if (method.getName().equalsIgnoreCase("makeSound")){
                    System.out.println("Method 'MakeSound()' is found");
                    elem.makeSound();
                }
            }

            System.out.println("");

        }

    }
}