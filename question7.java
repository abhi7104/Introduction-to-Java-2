public class question7 {
    public void convert(int sec)
    {
        int day = sec/(24*3600);

        sec = sec % (24*3600);
        int hour = sec/3600;

        sec = sec % 3600;
        int min = sec/60;

        sec = sec % 60;
        int seconds = sec;

        System.out.println("day: " + day + " hour: " + hour +" minute: " + min + " seconds: " + seconds);

    }
    public static void main(String[] args) {
        question7 q= new question7();
        q.convert(22323232);

    }
}
