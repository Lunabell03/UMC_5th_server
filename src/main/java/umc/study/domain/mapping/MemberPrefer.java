package umc.study.domain.mapping;

import jakarta.persistence.*;
import lombok.*;

import umc.study.domain.Member;
import umc.study.domain.base.BaseEntity;
import umc.study.domain.FoodCategory;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberPrefer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberPreferId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "memberId")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodCategoryId")
    private FoodCategory foodCategory;
}
