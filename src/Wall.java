public class Wall extends Obstacles{
    int wallHeight = 2;

    public boolean Wall(int jumpHeight) {
        boolean a;
        if (jumpHeight >= wallHeight) {
            System.out.println(" Получилось Перепрыгнуть");
            a = true;
        }   else {
            System.out.println(" Не получилось перепрыгнуть");
            a =false;
        }
        return a;
    }
}
