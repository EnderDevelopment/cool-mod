package com.viorele2009.coolmod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;

public
class CustomEntity extends Animal {
    public CustomEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    public static EntityType<CustomEntity> createEntityType() {
        return EntityType.Builder.of(CustomEntity::new, MobCategory.CREATURE)
        .sized(0.6f, 1.8f)
        .build("custom_entity");
    }
}
