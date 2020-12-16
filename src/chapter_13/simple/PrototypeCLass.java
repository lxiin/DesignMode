package chapter_13.simple;

import java.lang.reflect.Proxy;

public class PrototypeCLass implements Cloneable {
    @Override
    protected PrototypeCLass clone()  {
        PrototypeCLass prototypeCLass = null;
        try {
            prototypeCLass = (PrototypeCLass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeCLass;
    }
}
