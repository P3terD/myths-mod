package net.tsuk1.mythsmod.god_parent;

import net.minecraft.nbt.CompoundTag;

public class PlayerGodParent {
    private String godParent;

    public String getGod() {
        return godParent;
    }

    public void setGodParent(String godName) {
        this.godParent = godName;
    }

    public void copyFrom(PlayerGodParent source) {
        this.godParent = source.godParent;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putString("god_parent", godParent);
        System.out.println(nbt.getString("god_parent"));
    }

    public void loadNBTData(CompoundTag nbt) {
        nbt.getString("god_parent");
        this.godParent = nbt.getString("god_parent");
        System.out.println(nbt.getString("god_parent"));
    }
}
