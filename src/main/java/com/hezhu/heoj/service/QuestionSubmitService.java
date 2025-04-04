package com.hezhu.heoj.service;

import com.hezhu.heoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.hezhu.heoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hezhu.heoj.model.entity.User;

/**
* @author Marshall
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2025-03-27 00:02:26
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);


}
