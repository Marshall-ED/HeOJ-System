package com.hezhu.heojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @Author Marshall
 * @Date 2025/3/27 16:37
 * @Description: 题目用例
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;
    /**
     * 输出用例
     */
    private String output;
}
