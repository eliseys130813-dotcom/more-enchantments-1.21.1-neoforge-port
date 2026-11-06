package com.duck___.men.enchantments;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantment;
import net.neoforged.neoforge.common.CommonHooks;

import java.util.Optional;

import static com.duck___.men.MoreEnchantments1211.MODID;

public class enchantments {

    public static final ResourceKey<Enchantment> INDESTRUCTIBLE = ResourceKey.create(
            Registries.ENCHANTMENT,
            ResourceLocation.fromNamespaceAndPath(MODID, "indestructible"));

    public static Holder<Enchantment> INDESTRUCTIBLE_HOLDER() {
        return Optional.ofNullable(CommonHooks.resolveLookup(Registries.ENCHANTMENT))
                .orElseThrow(() -> new IllegalStateException("Enchantment registry is not available"))
                .getOrThrow(INDESTRUCTIBLE);
    }}
