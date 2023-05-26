package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author nzf
 * @since 2023-05-19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long userId;

    private String username;

    private String nickname;

    private String imageUrl;

    private LocalDateTime updateTime;

    private LocalDateTime createTime;


}
