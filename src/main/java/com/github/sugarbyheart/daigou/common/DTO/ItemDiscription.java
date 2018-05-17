package com.github.sugarbyheart.daigou.common.DTO;

import com.github.sugarbyheart.daigou.common.Enum.ItemBrandEnum;
import com.github.sugarbyheart.daigou.common.Enum.LinkTypeEnum;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class ItemDiscription implements Serializable {

    private String openId;
    private String link;
    private LinkTypeEnum linkTypeEnum;
    private ItemBrandEnum itemBrandEnum;

}
