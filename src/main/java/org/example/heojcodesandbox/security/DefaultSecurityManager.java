package org.example.heojcodesandbox.security;

import java.security.Permission;

/**
 * @Author Marshall
 * @Date 2025/5/1 6:10
 * @Description: 默认安全管理器
 */
public class DefaultSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        super.checkPermission(perm);
    }

}
