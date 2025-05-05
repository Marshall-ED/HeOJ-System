package org.example.heojcodesandbox.model;

import lombok.Data;

/**
 * @Author Marshall
 * @Date 2025/3/27 16:45
 * @Description: 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;
    /**
     * 消耗内存
     */
    private Long memory;
    /**
     * 消耗时间(KB)
     */
    private Long time;
}
