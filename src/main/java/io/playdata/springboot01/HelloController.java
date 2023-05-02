package io.playdata.springboot01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 어노테이션(Annotation) : @로 표시된 단축어, 바로가기
//@Controller // HelloController를 HTTP 통신을 위한 Controller로 쓰겠다 + Spring에 등록하겠다
@RestController // 페이지가 아니라 값을 돌려주는 Controller로 쓰겠다
public class HelloController {
    @RequestMapping("/") // /는 최상단의 인덱스 경로.
    public String hello() { // hello() 메소드
        return "hello world"; // 호출을 하면 hello라는 응답값을 주는 역할
    }

    @RequestMapping("/hello")
    public String hello2() {
        return "hello 천지회관";
    }
}
