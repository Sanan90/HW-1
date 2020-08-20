public class runningTrack extends Obstacles{
    int track = 1000;

    public boolean runningTrack1(int runningLength) {
        boolean a;
        if (runningLength >= track) {
            System.out.println(" Получилось пробежать");
            a = true;
        } else {
            System.out.println(" Не получилось пробежать");
            a = false;
        }
        return a;
    }

}
