package com.hezhu.heoj.judge.codesandbox.impl;

import com.hezhu.heoj.judge.codesandbox.CodeSandBox;
import com.hezhu.heoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.hezhu.heoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @Author Marshall
 * @Date 2025/4/26 12:32
 * @Description: 远程代码沙箱
 */
public class RemoteCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}
