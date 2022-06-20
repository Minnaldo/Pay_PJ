package com.example.Pay_PJ.controller;

import com.example.Pay_PJ.dto.Student;
import com.example.Pay_PJ.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("register/student")
    public String getTest(Student student) {


        // TODO 파라미터 검증

        // todo 서비스 호출
        testService.registerStudent(student);

        return  null;
    }
}
