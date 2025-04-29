package com.hezhu.heoj.judge.strategy;

import com.hezhu.heoj.model.dto.question.JudgeCase;
import com.hezhu.heoj.judge.codesandbox.model.JudgeInfo;
import com.hezhu.heoj.model.entity.Question;
import com.hezhu.heoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @Author Marshall
 * @Date 2025/4/29 16:19
 * @Description: 上下文（用于定义在策略中传递的参数）
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;
    private List<JudgeCase> judgeCaseList;
    private List<String> inputList;
    private List<String> outputList;
    private Question question;
    private QuestionSubmit questionSubmit;
}
