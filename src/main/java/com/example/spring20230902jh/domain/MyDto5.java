package com.example.spring20230902jh.domain;

import lombok.*;

@RequiredArgsConstructor // 파이널 필드일때 생성자에서 값을 받는걸
public class MyDto5 {
    private final String name;
    private final Integer age;
}
// @NoArgsConstructor // 파라미터 없는 생성자도 필요할때
// @AllArgsConstructor //