package me.leig.userinfo.logic.m01;

/**
 * @author leig
 */

public class M01001001 {

    public void m01001001(String username, String password) {
        // 参数验证
        if (null == username || "".equals(username)
                || null == password || "".equals(password)) {
            System.out.print("参数不能为空");
        }


    }

}
