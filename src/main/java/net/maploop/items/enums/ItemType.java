package net.maploop.items.enums;

public enum ItemType {
    SWORD("SWORD"),
    BOW("BOW"),
    BOOTS("BOOTS"),
    LEGGINGS("LEGGINGS"),
    CHESPLATE("CHESTPLATE"),
    HELMET("HELMET"),
    ITEM(""),
    WAND("WAND"),
    ACCESSORY("ACCESSORY"),
    DUNGEON_ITEM("DUNGEON ITEM"),
    DUNGEON_BOW("DUNGEON BOW"),
    DUNGEON_SWORD("DUNGEON SWORD"),
    AXE("AXE"),
    PICKAXE("PICKAXE"),
    HOE("HOE");

    private String s;

    ItemType(String s) {
        this.s = s;
    }

    public String getValue() {
        return s;
    }
}
