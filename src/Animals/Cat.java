package Animals;


public class Cat extends Animals {

    public Cat() {
    }

    public Cat(int run, float jump) {
        this.run = run;
        this.jump = jump;
    }

    public void catInfo() {
        System.out.println("run: " + canRun(run) + " " + "jump: " + canJump(jump) + " " + "swim: false");
        System.out.println();
    }

    private boolean canRun(int run) {
        boolean result;
        if (run >= 0 && run <= 200) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private boolean canJump(float jump) {
        boolean result;
        if (jump >= 0 && jump <= 2) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }
}
