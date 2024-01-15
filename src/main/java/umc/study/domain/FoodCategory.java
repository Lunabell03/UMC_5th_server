package umc.study.domain;

import lombok.*;
import jakarta.persistence.*;

import umc.study.domain.base.BaseEntity;


@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodCategory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodCategoryId;

    private String name;
}
