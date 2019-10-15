package com.sunth;

//import com.codingapi.txlcn.tc.annotation.LcnTransaction;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author Sunth
 * @DateTime 2019-10-11 9:58
 * 描述
 */
@Component
@Service
public class ServiceB {
    @Autowired
    private MapperB mapperB;
    @Autowired
    FeignClientB feignClientB;

//    @Transactional(rollbackFor = Exception.class)
//    @LcnTransaction
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public String  update(int money, String username) {
        String result="";

            int b=-1;
            int a=feignClientB.Update(money);
            if(a>0){
                b=mapperB.update(money,"zhangsan");
            }
            int m=mapperB.select("zhangsan");
            Optional.of("余额为:"+m).ifPresent(System.out::println);
            if(m<=0){
                result="余额不足";
                throw new RuntimeException("余额不足");
            }else{
                 result="success";
            }
        return result;

    }
}
