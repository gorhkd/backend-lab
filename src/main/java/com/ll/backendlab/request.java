package com.ll.backendlab;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class request {

    @PostMapping("/practice/request-param")
    public String requestParam(@RequestParam("title") String title) {
        return "서버에서 받은 값: " + title;
    }
}
