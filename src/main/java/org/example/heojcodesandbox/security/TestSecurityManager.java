package org.example.heojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.StandardCharsets;

/**
 * @Author Marshall
 * @Date 2025/5/1 6:29
 * @Description:
 */
public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());

        FileUtil.readLines("D:\\Workspace\\idea\\heoj-code-sandbox\\src\\main\\resources\\application.yaml", StandardCharsets.UTF_8);
    }
}
