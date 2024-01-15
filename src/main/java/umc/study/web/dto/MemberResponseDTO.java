package umc.study.web.dto;

import lombok.*;

import java.time.LocalDateTime;

public class MemberResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class JoinResultDTO{
        Long memberID;
        LocalDateTime createdAt;

    }
}
