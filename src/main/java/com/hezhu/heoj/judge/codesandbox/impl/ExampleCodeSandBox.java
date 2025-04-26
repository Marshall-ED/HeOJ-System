package com.hezhu.heoj.judge.codesandbox.impl;

import com.hezhu.heoj.judge.codesandbox.CodeSandBox;
import com.hezhu.heoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.hezhu.heoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.hezhu.heoj.model.dto.question.JudgeCase;
import com.hezhu.heoj.model.dto.questionsubmit.JudgeInfo;
import com.hezhu.heoj.model.enums.JudgeInfoMessageEnum;
import com.hezhu.heoj.model.enums.QuestionSubmitStatusEnum;

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
