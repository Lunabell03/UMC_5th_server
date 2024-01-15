package umc.study.domain.mapping;

import lombok.*;
import jakarta.persistence.*;

import umc.study.domain.Member;
import umc.study.domain.Terms;
import umc.study.domain.base.BaseEntity;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberAgree extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberAgreeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "termsId")
    private Terms terms;
}
