package com.github.sugarbyheart.daigou.common.DTO;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class ItemDetectResult implements Serializable {

    private boolean hasItem;
    private ItemDiscription itemDiscription;

}