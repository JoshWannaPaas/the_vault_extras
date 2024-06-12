package com.a1qs.the_vault_extras.mixins;

import iskallia.vault.client.ClientShardTradeData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.Random;

@Mixin(value={ClientShardTradeData.class}, remap = false)
public class MixingClientShardTradeData {
    @Shadow private static long tradeSeed;
    @Unique
    private static final int NUMBER_OF_SHARD_TRADES = 8;

    /**
     * @author JoshWannaPaas
     * @reason Increase Shard Shop Trades to 8 instead of 3
     */

    @Overwrite
    public static void nextSeed() {
        Random r = new Random(tradeSeed);
        for (int i = 0; i < NUMBER_OF_SHARD_TRADES; i++)
            r.nextLong();
        tradeSeed = r.nextLong();
    }
}
