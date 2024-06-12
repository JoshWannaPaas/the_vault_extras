package com.a1qs.the_vault_extras.mixins;

import iskallia.vault.container.base.AbstractPlayerSensitiveContainer;
import iskallia.vault.container.inventory.ShardTradeContainer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import net.minecraft.inventory.Inventory;


@Mixin(value={ShardTradeContainer.class}, remap = false)
public class MixinShardTradeContainer{

    
}
