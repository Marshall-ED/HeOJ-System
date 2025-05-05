package org.example.heojcodesandbox.Controller;

import org.example.heojcodesandbox.JavaNativeCodeSandBox;
import org.example.heojcodesandbox.model.ExecuteCodeRequest;
import org.example.heojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Marshall
 * @Date 2025/4/29 17:54
 * @Description:
 */
@RestController("/")
public class MainController {
    //定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";
    private static final String AUTH_REQUEST_SECRET = "secretKey";
    @Resource
    private JavaNativeCodeSandBox javaNativeCodeSandBox;
    @PostMapping("/executeCode")
    ExecuteCodeResponse executeCodeResponse(@RequestBody ExecuteCodeRequest executeCodeRequest, HttpServletRequest request, HttpServletResponse response){
        //基本的认证
        String authHeader = request.getHeader(AUTH_REQUEST_HEADER);
        if (!AUTH_REQUEST_SECRET.equals(authHeader)){
            response.setStatus(403);
            return null;
        }
        if (executeCodeRequest == null){
            throw new RuntimeException("请求参数为空");
        }
        return javaNativeCodeSandBox.executeCode( executeCodeRequest);
    }
}
