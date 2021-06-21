package lktbz.composite.new2021.price;

import java.util.Scanner;

/**
 * @Description TODO
 * @Author lktbz
 * @Date 2021/06/21
 */
public class DiscountFactory {
    /**
     * 工厂来创建相应策略
     * @param type
     * @return
     */
    public DiscountStrategy create(String type){
        /**
         * 单一折扣
         */
        if("ynn".equals(type)){
            return new VIPDiscount();
            }
        else if("nyn".equals(type)){
            return new StoreDiscount();
        }

        else if("nny".equals(type)){
            return new ActivityDiscount();
        }
        else{
            /**
             * 多种折扣策略
             */
            CompositeDiscount compositeDiscount;
            System.out.println("请选择冲突解决方案：1.折上折 2.最低折");
            Scanner scanner=new Scanner(System.in);
            int type2=scanner.nextInt();
            if(type2==1){
                compositeDiscount=new MultipleStrategy();
            }else {
                compositeDiscount=new SingleMinStrategy();
            }
            if(type.charAt(1)=='y'){compositeDiscount.add(new StoreDiscount());};
            if(type.charAt(0)=='y'){compositeDiscount.add(new VIPDiscount());}
            if(type.charAt(2)=='y'){compositeDiscount.add(new ActivityDiscount());}
            return compositeDiscount;

        }



    }


}
