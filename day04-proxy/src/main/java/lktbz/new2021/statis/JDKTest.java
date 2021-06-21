package lktbz.new2021.statis;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class JDKTest {
    public static void main(String[] args) {
        ProxyPeson peson=new ProxyPeson();
        IPesons iPesons = peson.cretaInstance(new ZsPerson());
        iPesons.findLove();

    }
}
