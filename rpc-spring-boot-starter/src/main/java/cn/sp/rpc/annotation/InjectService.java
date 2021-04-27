package cn.sp.rpc.annotation;

import java.lang.annotation.*;

/**
 * 该注解用于注入远程服务
 * @author 2YSP
 * @date 2020/7/26 13:13
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface InjectService {


}
