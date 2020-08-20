public class Robot extends Obstacles implements Running, Jumping {
    private String name;
    private int jumpHeight;
    private int runningLength;
    public Robot (String name, int jumpHeight, int runningLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningLength = runningLength;
    }

    @Override
    public void run() {
        System.out.println(this.name + " пробежал " + this.runningLength + " метров");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " совершил прыжок " + this.jumpHeight + " метров");
    }

    public boolean jumping() {
        boolean a = wall(this.jumpHeight);
        return a;
    }

    public boolean running() {
        boolean a = runningTrack(this.runningLength);
        return a;
    }

}
