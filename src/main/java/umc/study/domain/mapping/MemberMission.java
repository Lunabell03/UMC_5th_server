package umc.study.domain.mapping;

import lombok.*;
import jakarta.persistence.*;

import umc.study.domain.Member;
import umc.study.domain.Mission;
import umc.study.domain.base.BaseEntity;
import umc.study.domain.enums.MissionStatus;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberMissionId;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "missionId")
    private Mission mission;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;
}
