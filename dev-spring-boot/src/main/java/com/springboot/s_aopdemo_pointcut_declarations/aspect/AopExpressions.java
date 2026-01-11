package com.springboot.s_aopdemo_pointcut_declarations.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {
    @Pointcut("execution(* com.springboot.s_aopdemo_pointcut_declarations.dao.*.*(..))")
    public void forDaoPackage() {}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.springboot.s_aopdemo_pointcut_declarations.dao.*.get*(..))")
    public void getter() {}

    // create a pointcut fo setter methods
    @Pointcut("execution(* com.springboot.s_aopdemo_pointcut_declarations.dao.*.set*(..))")
    public void setter() {}

    // create pointcut: include package ... exclude getter/setter
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}
}
