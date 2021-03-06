package com.yixing.user.model;

import lombok.Data;

@Data
public class ResultMap {
    private String source;

    private String msg;

    public ResultMap(String source, String msg) {
        this.source = source;
        this.msg = msg;
    }
}
