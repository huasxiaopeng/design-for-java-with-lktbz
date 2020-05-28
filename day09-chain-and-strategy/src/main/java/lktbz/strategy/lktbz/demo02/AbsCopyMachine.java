package lktbz.strategy.lktbz.demo02;

/**
 * @ClassName AbsCopyMachine
 * @Description 基础的拷贝地址
 * @Author lktbz
 * @Date 2020/5/27
 */
public abstract class AbsCopyMachine {
   public abstract Item copy(String url);
   public static CopyMachineType getType(){
       return CopyMachineType.DEFAULT;
   }
   public  enum CopyMachineType{
       JD,
       ALI,
       TMAO,
       DEFAULT
   }
}
