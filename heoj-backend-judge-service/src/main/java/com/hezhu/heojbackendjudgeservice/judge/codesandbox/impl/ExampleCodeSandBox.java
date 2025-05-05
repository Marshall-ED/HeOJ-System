package com.hezhu.heojbackendjudgeservice.judge.codesandbox.impl;


import com.hezhu.heojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.hezhu.heojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hezhu.heojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import com.hezhu.heojbackendmodel.model.codesandbox.JudgeInfo;
import com.hezhu.heojbackendmodel.model.enums.JudgeInfoMessageEnum;
import com.hezhu.heojbackendmodel.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * @Author Marshall
 * @Date 2025/4/26 12:32
 * @Description: 示例代码沙箱（跑通业务流程）
 */
public class ExampleCodeSandBox implements CodeSandBox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();

        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);

        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
