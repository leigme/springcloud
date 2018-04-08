package me.leig.userinfo.comm;

/**
 * @author leig
 */

public class Tool {

    public boolean isNull(Object obj) {

        if (null == obj) {
            return false;
        }

        if (obj instanceof String) {
            return !"".equals(obj);
        } else if (obj instanceof Integer) {
            return 0 < (Integer) obj;
        }
        else {
            return false;
        }
    }

}
