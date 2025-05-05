package com.hezhu.heojbackendjudgeservice.judge.codesandbox;


import com.hezhu.heojbackendjudgeservice.judge.codesandbox.impl.ExampleCodeSandBox;
import com.hezhu.heojbackendjudgeservice.judge.codesandbox.impl.RemoteCodeSandBox;
import com.hezhu.heojbackendjudgeservice.judge.codesandbox.impl.ThirdPartyCodeSandBox;

/**
 * @Author Marshall
 * @Date 2025/4/26 13:20
 * @Description:
 */
public class CodeSandBoxFactory {
    /**
     * 创建代码沙箱示例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandBox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandBox();
            case "remote":
                return new RemoteCodeSandBox();
            case "thirdParty":
                return new ThirdPartyCodeSandBox();
            default:
                return new ExampleCodeSandBox();
        }
    }
}
