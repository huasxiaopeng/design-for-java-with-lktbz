package lktbz.strategy.lktbz.demo02;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CopyStragyFactory
 * @Description 策略工厂类
 * @Author lktbz
 * @Date 2020/5/27
 */
public class CopyStragyFactory {
 private static Map<AbsCopyMachine.CopyMachineType,AbsCopyMachine> FACTORY_COPY=new HashMap<AbsCopyMachine.CopyMachineType,AbsCopyMachine>();
    static {
        FACTORY_COPY.put(AbsCopyMachine.CopyMachineType.ALI,new AliCopy());
        FACTORY_COPY.put(AbsCopyMachine.CopyMachineType.JD,new JDCopy());
        FACTORY_COPY.put(AbsCopyMachine.CopyMachineType.TMAO,new TMaoCopy());
    }

    private CopyStragyFactory() {
    }
    //指定默认的
    private static  AbsCopyMachine DEFAULT=new AliCopy();
    public static  AbsCopyMachine getCopyMachine(AbsCopyMachine.CopyMachineType type){
        AbsCopyMachine absCopyMachine = FACTORY_COPY.get(type);
        return absCopyMachine==null?DEFAULT:absCopyMachine;
    }
}
