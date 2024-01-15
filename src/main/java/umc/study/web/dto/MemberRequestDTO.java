package umc.study.web.dto;

import lombok.*;

import java.util.*;

public class MemberRequestDTO {
    @Getter
    public static class JoinDTO{
        String name;
        Integer gender;
        Integer birthYear;
        Integer birthMonth;
        Integer birthDay;
        String address;
        String specAddress;
        List<Long> preferCategory;
    }
}
