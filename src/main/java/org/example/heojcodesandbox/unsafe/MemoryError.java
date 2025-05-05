package org.example.heojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Marshall
 * @Date 2025/4/30 15:33
 * @Description: 无限占用空间（浪费系统内存）
 */
public class MemoryError {
    public static void main(String[] args) throws InterruptedException {
        List<byte[]> bytes = new ArrayList<>();
        while (true){
            bytes.add(new byte[10000]);
        }
    }
}
