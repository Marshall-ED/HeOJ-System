package com.hezhu.heojbackendjudgeservice.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

import com.hezhu.heojbackendcommon.common.ErrorCode;
import com.hezhu.heojbackendcommon.exception.BusinessException;
import com.hezhu.heojbackendjudgeservice.judge.codesandbox.CodeSandBox;
import com.hezhu.heojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.hezhu.heojbackendmodel.model.codesandbox.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author Marshall
 * @Date 2025/4/26 12:32
 * @Description: 远程代码沙箱
 */
public class RemoteCodeSandBox implements CodeSandBox {

    //定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER,AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)) {
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR, "executeCode remoteSandbox error, message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }
}
