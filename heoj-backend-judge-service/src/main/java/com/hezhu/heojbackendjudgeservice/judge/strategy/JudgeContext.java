package com.hezhu.heojbackendjudgeservice.judge.strategy;


import com.hezhu.heojbackendmodel.model.codesandbox.JudgeInfo;
import com.hezhu.heojbackendmodel.model.dto.question.JudgeCase;
import com.hezhu.heojbackendmodel.model.entity.Question;
import com.hezhu.heojbackendmodel.model.entity.QuestionSubmit;
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
