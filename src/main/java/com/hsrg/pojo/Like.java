package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Like {
    private Long likeId;
    private Long userId;
    private Long targetId;
    private Integer targetType;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
}
