interface furniture{
    public void stresstest();
    public void firetest();
}
abstract class chair implements furniture
{
    public abstract String chairtype();
}
abstract class table implements furniture
{
    public abstract String tabletype();
}
class metalchair extends chair{
    @Override
    public void firetest() {
        System.out.println("pass");
    }

    @Override
    public void stresstest() {
        System.out.println("pass");
    }
    @Override
    public String chairtype()
    {
        return"metalchair";
    }
}

class woodenchair extends chair{
    @Override
    public void stresstest() {
        System.out.println("pass");
    }

    @Override
    public void firetest() {
        System.out.println("fail");
    }

    @Override
    public String chairtype() {
        return "woodenchair";
    }
}
class metaltable extends table{
    @Override
    public void firetest() {
        System.out.println("pass");
    }

    @Override
    public void stresstest() {
        System.out.println("pass");
    }

    @Override
    public String tabletype() {
        return "wooden";
    }
}
class woodentable extends table{
    @Override
    public void stresstest() {
        System.out.println("fail");
    }

    @Override
    public void firetest() {
        System.out.println("pass");
    }

    @Override
    public String tabletype() {
        return "metal";
    }
}
public class question9 {
    public static void main(String[] args) {
        woodentable wt = new woodentable();
        woodenchair wc = new woodenchair();
        metaltable mt = new metaltable();
        metalchair mc =new metalchair();
        wt.firetest();
        System.out.println(wc.chairtype());
        System.out.println(mt.tabletype());
        mc.stresstest();
    }
}
