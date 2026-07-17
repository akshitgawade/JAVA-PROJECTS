        class Animal{
            void eat() {
                System.out.println("Animal is eating");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("Dog is barking");
            }
        }

        class Cat extends Animal {
            void meow() {
                System.out.println("Cat is meowing");
            }
        }
        
        class hinherit {
            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.eat(); // Call the inherited method
                dog.bark(); // Call the subclass method

        Cat cat = new Cat();
        cat.eat(); // Call the inherited method
        cat.meow(); // Call the subclass method
    }
}

