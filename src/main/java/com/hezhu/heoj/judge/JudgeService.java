package com.hezhu.heoj.judge;

import com.hezhu.heoj.model.entity.QuestionSubmit;

/**
 * @Author Marshall
 * @Date 2025/4/29 14:53
 * @Description: 判题服务
 */
public interface JudgeService {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge (long questionSubmitId);
}
