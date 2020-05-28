package lktbz.strategy.lktbz.demo02;

/**
 * @ClassName Test
 * @Description TODO
 * @Author lktbz
 * @Date 2020/5/27
 */
public class Test {
    public static void main(String[] args) {
        AbsCopyMachine copyMachine = CopyStragyFactory.getCopyMachine(AbsCopyMachine.CopyMachineType.TMAO);
        Item ssdsds = copyMachine.copy("ssdsds");

    }
}
