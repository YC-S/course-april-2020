package core.java.topic.designPattern.singleton;

import java.io.Serializable;

/**
 * @author shiyuanchen
 * @created 2020/04/30
 * @project course-april-2020
 */
public class AppleDesignerFactory implements Serializable, Cloneable {

    private static AppleDesignerFactory instance;

    public static synchronized AppleDesignerFactory getInstance() {
        if (instance == null) {
            instance = new AppleDesignerFactory();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }
}
