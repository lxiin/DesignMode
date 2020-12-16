package chapter_12.simple2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerIH implements InvocationHandler {

    Class cls = null;
    Object object = null;

    public GamePlayerIH(Object _obj){
        this.object = _obj;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.object,args);
        if (method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的账号登录..");
        }
        return result;
    }
}
