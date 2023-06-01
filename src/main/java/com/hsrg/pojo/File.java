package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Year;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class File {
    private Long fileId;
    private Long userId;
    private String fileUrl;
    private String title;
    private String context;
    private Year yearTag;
    private String courseTag;
    private String typeTag;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
}
