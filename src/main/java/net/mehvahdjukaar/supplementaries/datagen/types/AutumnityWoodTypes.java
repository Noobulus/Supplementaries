package net.mehvahdjukaar.supplementaries.datagen.types;

import net.minecraft.world.level.material.MaterialColor;


public enum AutumnityWoodTypes implements IWoodType {
    MAPLE("maple", MaterialColor.TERRACOTTA_ORANGE);

    private final String name;
    private final MaterialColor color;

    AutumnityWoodTypes(String name, MaterialColor color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public MaterialColor getColor() {
        return this.color;
    }

    @Override
    public String getRegName() {
        return this.name+"_aut";
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public String getNamespace() {
        return "autumnity";
    }
}
