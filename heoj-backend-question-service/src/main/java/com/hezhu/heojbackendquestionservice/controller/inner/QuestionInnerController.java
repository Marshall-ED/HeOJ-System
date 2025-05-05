package com.hezhu.heojbackendquestionservice.controller.inner;

import com.hezhu.heojbackendmodel.model.entity.Question;
import com.hezhu.heojbackendmodel.model.entity.QuestionSubmit;
import com.hezhu.heojbackendquestionservice.service.QuestionService;
import com.hezhu.heojbackendquestionservice.service.QuestionSubmitService;
import com.hezhu.heojbackendserviceclient.service.QuestionFeignClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author Marshall
 * @Date 2025/5/4 16:41
 * @Description: 该服务仅内部调用
 */
@RestController
@RequestMapping("/inner")
public class QuestionInnerController implements QuestionFeignClient {

    @Resource
    private QuestionService questionService;

    @Resource
    private QuestionSubmitService questionSubmitService;


    @GetMapping("/get/id")
    @Override
    public Question getQuestionById(@RequestParam("questionId") long questionId) {
        return questionService.getById(questionId);
    }

    @GetMapping("/question_submit/get/id")
    @Override
    public QuestionSubmit getQuestionSubmitById(@RequestParam("questionSubmitId") long questionSubmitId) {
        return questionSubmitService.getById(questionSubmitId);
    }

    @PostMapping("/question_submit/update")
    @Override
    public boolean updateQuestionSubmitById(@RequestBody QuestionSubmit questionSubmit) {
        return questionSubmitService.updateById(questionSubmit);
    }
}
