package com.example.demo.Vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data

public class PageVo {
    @JsonProperty("actionEntitySet")
    private List<ActionVo> actionVoList;

    @JsonProperty("permissionId")
    private String pageName;

    @JsonProperty("permissionName")
    private String pageDescription;
}
