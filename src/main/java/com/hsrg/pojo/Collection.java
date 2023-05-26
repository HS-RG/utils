package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
public class Collection {

    private long userId;

    private String fileId;

    private LocalDateTime createTime;


}
