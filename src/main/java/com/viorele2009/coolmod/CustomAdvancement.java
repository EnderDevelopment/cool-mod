package com.viorele2009.coolmod;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.RequirementsStrategy;
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger;
import net.minecraft.resources.ResourceLocation;

public
class CustomAdvancement {
    public static Advancement createAdvancement() {
        Advancement.Builder builder = Advancement.Builder.advancement();
        builder.addCriterion("recipe_unlocked", RecipeUnlockedTrigger.unlocked(new ResourceLocation("coolmod:custom_recipe")));
        builder.rewards(AdvancementRewards.Builder.reward().addExperience(10));
        builder.requirements(RequirementsStrategy.OR);
        return builder.build(new ResourceLocation("coolmod:custom_advancement"));
    }
}
