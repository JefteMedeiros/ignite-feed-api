package com.jeff.ignitefeed.exceptions;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class StandardError {
    private LocalDateTime timeStamp;

    private Integer status;

    private String error;

    private String message;

    private String path;
}
