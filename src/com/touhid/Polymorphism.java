package com.touhid;
// Base class
class Move {
    private String name;
    public Move(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

// sub classes
class Jaws extends Move {
    // constructor function
    public Jaws() {
        super("Jaws"); // need to super method to inherit form base class
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Move{
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Alien's attempt to take over the planet earth";
    }
}

class MazeRunner extends Move {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Move {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgetable extends Move {
    public Forgetable() {
        super("Forgetable");
    }
    // no plot method
}
public class Polymorphism {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Move move = randomMovie();
            System.out.println("Movie #" + i +
                              " : " + move.getName() + "\n" +
                              "plot: " + move.plot());
        }
    }

    public static Move randomMovie() {
        int randomNumber = (int) (Math.random() * 5 ) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
