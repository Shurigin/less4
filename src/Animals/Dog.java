package Animals;

public class Dog extends Animals {
    protected int swim;

    public Dog() {

    }

    public Dog(int run, float jump, int swim) {
        this.run = run;
        this.jump = jump;
        this.swim = swim;
    }

    public void dogInfo() {
        System.out.println("run: " + canRun(run) + " " + "jump: " + canJump(jump) + " " + "swim: " + canSwim(swim));
        System.out.println();
    }

    private boolean canRun(int run) {
        boolean result;
        if (run >= 0 && run <= 500) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }


    private boolean canJump(float jump){
        boolean result;
        if(jump >= 0 && jump <= 0.5) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
    private boolean canSwim(int swim){
        boolean result;
        if(swim >= 0 && swim <=10) {
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }
}
