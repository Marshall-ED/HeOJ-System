package com.hezhu.heojbackendjudgeservice.judge;


import com.hezhu.heojbackendjudgeservice.judge.strategy.DefaultJudgeStrategyImpl;
import com.hezhu.heojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.hezhu.heojbackendjudgeservice.judge.strategy.JudgeContext;
import com.hezhu.heojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.hezhu.heojbackendmodel.model.codesandbox.JudgeInfo;
import com.hezhu.heojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * @Author Marshall
 * @Date 2025/4/29 16:46
 * @Description: 判题管理（尽量简化对判题功能）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategyImpl();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
