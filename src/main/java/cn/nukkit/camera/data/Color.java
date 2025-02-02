package cn.nukkit.camera.data;

import cn.nukkit.nbt.tag.CompoundTag;

/**
 * @author daoge_cmd
 * @date 2023/6/11
 * PowerNukkitX Project
 */
public record Color(float r, float g, float b) implements SerializableData {
    public CompoundTag serialize() {
        return new CompoundTag("color")
                .putFloat("r", r)
                .putFloat("g", g)
                .putFloat("b", b);
    }
}
