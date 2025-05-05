package com.hezhu.heojbackendmodel.model.dto.question;

import lombok.Data;

/**
 * @Author Marshall
 * @Date 2025/3/27 16:37
 * @Description: 题目配置
 */
@Data
public class JudgeConfig {

    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;
}
