package lktbz.medi.rpc;

/**
 * Created by Tom.
 */
public class AService implements IService {
    Registy registy;
    AService(){
        registy.regist("aService",this);
    }

    public void a(){
        //registy.get("bService").xxx();
    }
}
