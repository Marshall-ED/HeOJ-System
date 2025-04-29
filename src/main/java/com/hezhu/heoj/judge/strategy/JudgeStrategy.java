package com.hezhu.heoj.judge.strategy;

import com.hezhu.heoj.judge.codesandbox.model.JudgeInfo;

/**
 * @Author Marshall
 * @Date 2025/4/29 16:18
 * @Description:
 */
public interface JudgeStrategy {
    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}
