package lktbz.medi.rpc;

/**
 * Created by Tom.
 */
public class BService implements IService{
    Registy registy;
    BService(){
        registy.regist("bService",this);
    }
}
