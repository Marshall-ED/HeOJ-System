package org.example.heojcodesandbox;


import org.example.heojcodesandbox.model.ExecuteCodeRequest;
import org.example.heojcodesandbox.model.ExecuteCodeResponse;

/**
 * @Author Marshall
 * @Date 2025/4/26 12:20
 * @Description: 代码沙箱接口定义
 */
public interface CodeSandBox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
