package simple;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Description CAS 级别单利模式
 * @Author lktbz
 * @Date 2021/06/23
 */
public class AtomicReferenceLockDemo {
    private static final AtomicReference<AtomicReferenceLockDemo> INSTANCE = new AtomicReference<AtomicReferenceLockDemo>();

    private static AtomicReferenceLockDemo instance;

    private AtomicReferenceLockDemo() {
    }

    public static final AtomicReferenceLockDemo getInstance() {
        for (; ; ) {
            AtomicReferenceLockDemo instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new AtomicReferenceLockDemo());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(AtomicReferenceLockDemo.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
        System.out.println(AtomicReferenceLockDemo.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
    }
}
