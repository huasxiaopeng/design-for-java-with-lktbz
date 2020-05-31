package lktbz.adapter.lktbz;

/**
 * @ClassName SocketObjectAdapterImpl
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/31
 */
public class SocketObjectAdapterImpl  implements SocketAdapter{
    //使用组合方式
    //Using Composition for adapter pattern
    private Socket sock = new Socket();

    @Override
    public Volt get120Volt() {
        return sock.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v= sock.getVolt();
        return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i) {
        return new Volt(v.getVolts()/i);
    }
}
