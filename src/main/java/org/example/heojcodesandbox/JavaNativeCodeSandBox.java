package org.example.heojcodesandbox;

import org.example.heojcodesandbox.model.ExecuteCodeRequest;
import org.example.heojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * @Author Marshall
 * @Date 2025/5/3 18:45
 * @Description: Java 原生代码沙箱实现（直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandBox extends JavaCodeSandboxTemplate {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest);
    }
}
