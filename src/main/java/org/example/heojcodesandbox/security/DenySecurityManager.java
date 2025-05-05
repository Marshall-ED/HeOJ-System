package org.example.heojcodesandbox.security;

import java.security.Permission;

/**
 * @Author Marshall
 * @Date 2025/5/1 6:18
 * @Description: 所有权限拒绝
 */
public class DenySecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限不足" + perm.toString());
    }
}
