package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Long commentId;
    private Long parentId;
    private Integer type;
    private Long replyTo;
    private Long authorId;
    private String context;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
}
