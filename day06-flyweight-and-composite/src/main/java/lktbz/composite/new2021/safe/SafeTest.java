package lktbz.composite.new2021.safe;


/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class SafeTest {
    public static void main(String[] args) {

        System.out.println("============安全组合模式===========");

        Files qq = new Files("QQ.exe");
        Files wx = new Files("微信.exe");

        Folders office = new Folders("办公软件",2);

        Files word = new Files("Word.exe");
        Files ppt = new Files("PowerPoint.exe");
        Files excel = new Files("Excel.exe");

        office.add(word);
        office.add(ppt);
        office.add(excel);

        Folders wps = new Folders("金山软件",3);
        wps.add(new Files("WPS.exe"));
        office.add(wps);

        Folders root = new Folders("根目录",1);
        root.add(qq);
        root.add(wx);
        root.add(office);

        System.out.println("----------show()方法效果-----------");
        root.show();

        System.out.println("----------list()方法效果-----------");
        root.list();


    }
}
