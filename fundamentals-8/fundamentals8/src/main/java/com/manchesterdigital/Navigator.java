package com.manchesterdigital;

public class Navigator {
    private Direction direction;
    private Integer step;


    public Navigator(Direction direction, Integer step) {
        this.direction = direction;
        this.step = step;
    }

    public Navigator() {
        direction = Direction.NORTH;
        step = 0;
    }

    public void printNumberOfSteps() {
        System.out.println("Number of steps done: " +  this.getStep());
    }

    public void moveForward(int step) {
        this.step = step;
        System.out.println("You moved forward " + step + " steps");
    }

    public void moveBack(int step) {
        if(step > this.step) {
            System.out.println("You moved backward " + (this.step) + " steps");
            this.step = 0;

        } else {
            this.step -= step;
            System.out.println("You moved backward " + step + " steps");
        }

    }

    public void moveLeft(int step) {
        this.step += step;
        System.out.println("You moved left " + step + " steps");
    }

    public void moveRight(int step) {
        this.step += step;
        System.out.println("You moved right " + step + " steps");
    }

    public void rotate(int degrees) {
        if(degrees > 0 && degrees <= 360) {
            if(degrees > 0 && degrees <= 90) {
                this.direction = Direction.EAST;
            } else if (degrees > 90 && degrees <= 180) {
                this.direction = Direction.SOUTH;
            } else if ( degrees > 180 && degrees <= 270) {
                this.direction = Direction.WEST;
            }
        } else {
            System.out.println("Does not go around");
        }
        System.out.println("You facing " + direction + " direction");
    }


    public Integer getStep() {
        return step;
    }

    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.moveForward(7);
        navigator.moveLeft(7);
        navigator.printNumberOfSteps();

        navigator.moveBack(20);
        navigator.printNumberOfSteps();

        navigator.rotate(78);
        navigator.rotate(123);
    }
}
