package org.example.heojcodesandbox.model;

import lombok.Data;

/**
 * @Author Marshall
 * @Date 2025/4/30 11:04
 * @Description: 进程执行信息
 */
@Data
public class ExecuteMessage {
    private Integer exitValue;
    private String message;
    private String errorMessage;
    private Long time;
    private Long memory;
}
