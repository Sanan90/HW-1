public class Obstacles {

    public boolean wall(int jumpHeight) {
        boolean a = new Wall().Wall(jumpHeight);
        return a;
    }

    public boolean runningTrack(int runningLength) {
        boolean a = new runningTrack().runningTrack1(runningLength);
        return a;
    }
}
