package com.hezhu.heojbackendserviceclient.service;


import com.hezhu.heojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Marshall
 * @Date 2025/4/29 14:53
 * @Description: 判题服务
 */
@FeignClient(name = "heoj-backend-judge-service",path = "/api/judge/inner")
public interface JudgeFeignClient {

    /**
     * 判题
     *
     * @param questionSubmitId
     * @return
     */
    @PostMapping("/do")
    QuestionSubmit doJudge (@RequestParam("questionSubmitId") long questionSubmitId);
}
