package com.github.sugarbyheart.daigou.common.Enum;

public enum ItemBrandEnum {

    LAMER(ItemBrand.LAMER),
    LANCOME(ItemBrand.LANCOME),
    KIEHLS(ItemBrand.KIEHLS),
    ESTEE_LAUDER(ItemBrand.ESTEE_LAUDER),
    OTHERS(ItemBrand.OTHERS);

    private final String _text;

    ItemBrandEnum(final String text) {
        this._text = text;
    }

    @Override
    public String toString() {
        return _text;
    }

    public static ItemBrandEnum inst(String strVal) {
        for (ItemBrandEnum type : ItemBrandEnum.values()) {
            if (type.toString().equalsIgnoreCase(strVal)) {
                return type;
            }
        }
        return null;
    }
}
