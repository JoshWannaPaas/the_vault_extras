package com.a1qs.the_vault_extras.integration;

import com.google.common.collect.Lists;
import iskallia.vault.Vault;
import iskallia.vault.init.ModAttributes;
import iskallia.vault.init.ModItems;
import iskallia.vault.item.ArtisanScrollItem;
import iskallia.vault.item.crystal.CrystalData;
import iskallia.vault.item.crystal.VaultCrystalItem;
import iskallia.vault.item.gear.VaultGear;
import mezz.jei.api.recipe.vanilla.IVanillaRecipeFactory;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Collections;

public class AnvilRecipeProvider {

    public static ArrayList getAnvilRecipes(IVanillaRecipeFactory factory) {
        ArrayList recipeList = Lists.newArrayList();

        //Cake Objective Crystal
        ItemStack cakeCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData cakeData = VaultCrystalItem.getData(cakeCrystal);
        cakeData.setSelectedObjective(Vault.id("cake_hunt"));
        VaultCrystalItem.setRandomSeed(cakeCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(com.a1qs.the_vault_extras.init.ModItems.CAKE_SEAL.get())), Collections.singletonList(cakeCrystal)));

        //Kill the Boss Objective Crystal
        ItemStack bossCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData bossData = VaultCrystalItem.getData(bossCrystal);
        bossData.setSelectedObjective(Vault.id("summon_and_kill_boss"));
        VaultCrystalItem.setRandomSeed(bossCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_EXECUTIONER)), Collections.singletonList(bossCrystal)));

        //Scavenger Objective Crystal
        ItemStack scavengerCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData scavengerData = VaultCrystalItem.getData(scavengerCrystal);
        scavengerData.setSelectedObjective(Vault.id("scavenger_hunt"));
        VaultCrystalItem.setRandomSeed(scavengerCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_HUNTER)), Collections.singletonList(scavengerCrystal)));

        //Architect Objective Crystal
        ItemStack architectCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData architectData = VaultCrystalItem.getData(architectCrystal);
        architectData.setSelectedObjective(Vault.id("architect"));
        VaultCrystalItem.setRandomSeed(architectCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_ARCHITECT)), Collections.singletonList(architectCrystal)));

        //Ancients Objective Crystal
        ItemStack ancientCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData ancientData = VaultCrystalItem.getData(ancientCrystal);
        ancientData.setSelectedObjective(Vault.id("ancients"));
        VaultCrystalItem.setRandomSeed(ancientCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_ANCIENTS)), Collections.singletonList(ancientCrystal)));

        //Raid Objective Crystal
        ItemStack raidCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData raidData = VaultCrystalItem.getData(raidCrystal);
        raidData.setSelectedObjective(Vault.id("raid_challenge"));
        VaultCrystalItem.setRandomSeed(raidCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_RAID)), Collections.singletonList(raidCrystal)));

        //Raffle Objective Crystal
        ItemStack raffleCrystal = new ItemStack(ModItems.VAULT_CRYSTAL);
        CrystalData raffleData = VaultCrystalItem.getData(raffleCrystal);
        raffleData.setSelectedObjective(Vault.id("summon_and_kill_boss"));
        raffleData.setType(CrystalData.Type.RAFFLE);
        raffleData.setPlayerBossName("???");
        VaultCrystalItem.setRandomSeed(raffleCrystal);
        recipeList.add(factory.createAnvilRecipe(new ItemStack(ModItems.VAULT_CRYSTAL), Collections.singletonList(new ItemStack(ModItems.CRYSTAL_SEAL_RAFFLE)), Collections.singletonList(raffleCrystal)));


        //todo: probably refactor this to not show redundant information

        //Repair Vault Armor Item [T1]
        ItemStack vaultArmorPieceT1 = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ItemStack repairedVaultArmorPieceT1 = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 1, false);
        vaultArmorPieceT1.setDamage(1099);

        recipeList.add(factory.createAnvilRecipe(vaultArmorPieceT1, Collections.singletonList(new ItemStack(ModItems.REPAIR_CORE)), Collections.singletonList(repairedVaultArmorPieceT1)));

        //Repair Vault Armor Item [T2]
        ItemStack vaultArmorPieceT2 = createArmorPiece(VaultGear.State.IDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, 2, 8.0D, 0.7D, 1600, 0, 5, 0, 0, false);
        ItemStack repairedVaultArmorPieceT2 = createArmorPiece(VaultGear.State.IDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, 2, 8.0D, 0.7D, 1600, 0, 5, 0, 1, false);
        vaultArmorPieceT2.setDamage(1599);

        recipeList.add(factory.createAnvilRecipe(vaultArmorPieceT2, Collections.singletonList(new ItemStack(ModItems.REPAIR_CORE_T2)), Collections.singletonList(repairedVaultArmorPieceT2)));

        //Repair Vault Armor Item [T3]
        ItemStack vaultArmorPieceT3 = createArmorPiece(VaultGear.State.IDENTIFIED, 2, VaultGear.Rarity.SCRAPPY, 3, 11.0D, 1.3D, 3200, 0, 5, 0, 0, false);
        ItemStack repairedVaultArmorPieceT3 = createArmorPiece(VaultGear.State.IDENTIFIED, 2, VaultGear.Rarity.SCRAPPY, 3, 11.0D, 1.3D, 3200, 0, 5, 0, 1, false);
        vaultArmorPieceT3.setDamage(3199);

        recipeList.add(factory.createAnvilRecipe(vaultArmorPieceT3, Collections.singletonList(new ItemStack(ModItems.REPAIR_CORE_T3)), Collections.singletonList(repairedVaultArmorPieceT3)));

        //Create Artisan Scroll
        ItemStack artisanArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ModAttributes.ADD_ARMOR.create(artisanArmorPiece, 1.0D);
        ItemStack newArtisanScroll = new ItemStack(ModItems.ARTISAN_SCROLL);
        ArtisanScrollItem.setInitialized(newArtisanScroll, true);
        newArtisanScroll.getOrCreateTag().putString("attribute", "minecraft:add_armor");
        newArtisanScroll.getOrCreateTag().putInt("slot", 4);

        recipeList.add(factory.createAnvilRecipe(artisanArmorPiece, Collections.singletonList(new ItemStack(ModItems.FABRICATION_JEWEL)), Collections.singletonList(newArtisanScroll)));

        //Artisan Scroll Rerolling
        ItemStack scrollArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ItemStack scrollRerolledArmorPiece = createArmorPiece(VaultGear.State.UNIDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, -1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, true);

        recipeList.add(factory.createAnvilRecipe(scrollArmorPiece, Collections.singletonList(new ItemStack(ModItems.ARTISAN_SCROLL)), Collections.singletonList(scrollRerolledArmorPiece)));

        //T1 Vault Plating
        ItemStack t1plateArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ItemStack t1platedArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ModAttributes.ADD_PLATING.create(t1platedArmorPiece, 1);

        recipeList.add(factory.createAnvilRecipe(t1plateArmorPiece, Collections.singletonList(new ItemStack(ModItems.VAULT_PLATING)), Collections.singletonList(t1platedArmorPiece)));

        //T2 Vault Plating
        ItemStack t2plateArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, 2, 8.0D, 0.7D, 1600, 0, 5, 0, 0, false);
        ItemStack t2platedArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, 2, 8.0D, 0.7D, 1600, 0, 5, 0, 0, false);
        ModAttributes.ADD_PLATING.create(t2platedArmorPiece, 1);

        recipeList.add(factory.createAnvilRecipe(t2plateArmorPiece, Collections.singletonList(new ItemStack(ModItems.VAULT_PLATING_T2)), Collections.singletonList(t2platedArmorPiece)));

        //T3 Vault Plating
        ItemStack t3plateArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 2, VaultGear.Rarity.SCRAPPY, 3, 11.0D, 1.3D, 3200, 0, 5, 0, 0, false);
        ItemStack t3platedArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 2, VaultGear.Rarity.SCRAPPY, 3, 11.0D, 1.3D, 3200, 0, 5, 0, 0, false);
        ModAttributes.ADD_PLATING.create(t3platedArmorPiece, 1);

        recipeList.add(factory.createAnvilRecipe(t3plateArmorPiece, Collections.singletonList(new ItemStack(ModItems.VAULT_PLATING_T2)), Collections.singletonList(t3platedArmorPiece)));

        //Wutax Shard application
        ItemStack nonWutaxArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 25, 0, false);
        ItemStack wutaxedArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 0, 5, 24, 0, false);

        recipeList.add(factory.createAnvilRecipe(nonWutaxArmorPiece, Collections.singletonList(new ItemStack(ModItems.WUTAX_SHARD)), Collections.singletonList(wutaxedArmorPiece)));

        //Wutax Crystal application
        ItemStack nonLeveledArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 1, 5, 25, 0, false);
        ItemStack leveledArmorPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, 1, 5.0D, 0.2D, 1100, 1, 5, 24, 0, false);
        VaultGear.addLevel(leveledArmorPiece, 1.0F);
        ModAttributes.ADD_ARMOR.create(leveledArmorPiece, 1.0D);

        recipeList.add(factory.createAnvilRecipe(nonLeveledArmorPiece, Collections.singletonList(new ItemStack(ModItems.WUTAX_CRYSTAL)), Collections.singletonList(leveledArmorPiece)));

        //T2 Gear charm application
        ItemStack nonT2GearCharmedArmorPiece = createArmorPiece(VaultGear.State.UNIDENTIFIED, 0, VaultGear.Rarity.SCRAPPY, -1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ModAttributes.GEAR_ROLL_TYPE.create(nonT2GearCharmedArmorPiece, "Epic");
        ItemStack T2GearCharmedArmorPiece = createArmorPiece(VaultGear.State.UNIDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, -1, 5.0D, 0.2D, 1100, 0, 5, 0, 0, false);
        ModAttributes.GEAR_ROLL_TYPE.create(T2GearCharmedArmorPiece, "Common");

        recipeList.add(factory.createAnvilRecipe(nonT2GearCharmedArmorPiece, Collections.singletonList(new ItemStack(ModItems.GEAR_CHARM)), Collections.singletonList(T2GearCharmedArmorPiece)));

        //T2 Gear charm application
//        ItemStack nonT3GearCharmedArmorPiece = createArmorPiece(VaultGear.State.UNIDENTIFIED, 1, VaultGear.Rarity.SCRAPPY, -1, 11.0D, 1.3D, 3200, 0, 5, 0, 0, false);
//        ModAttributes.GEAR_ROLL_TYPE.create(nonT3GearCharmedArmorPiece, "Epic");
//        ItemStack T3GearCharmedArmorPiece = createArmorPiece(VaultGear.State.UNIDENTIFIED, 2, VaultGear.Rarity.SCRAPPY, -1, 11.0D, 1.3D, 3200, 0, 5, 0, 0, false);
//        ModAttributes.GEAR_ROLL_TYPE.create(T3GearCharmedArmorPiece, "Common");
//        addTooltip(ItemTooltipEvent, )

//        recipeList.add(factory.createAnvilRecipe(nonT3GearCharmedArmorPiece, Collections.singletonList(new ItemStack(ModItems.GEAR_CHARM)), Collections.singletonList(T3GearCharmedArmorPiece)));

        // Flawed ruby application
        //ItemStack nonImbuedPiece = createArmorPiece(VaultGear.State.IDENTIFIED, 2, )



        //todo: Add integration to:
        // - runes/catalysts/inhibitors and painite stars
        // - banished souls
        // - magnets
        // - void orbs
        // - flawed rubies

        return recipeList;
    }

    private static ItemStack createArmorPiece(VaultGear.State state, int tier, VaultGear.Rarity rarity, int model, double armor, double toughness, int durability, int maxLevel, int maxRepairs, int minVaultLevel, int currentRepairs, boolean reforged) {
        ItemStack stack = new ItemStack(ModItems.CHESTPLATE);

        ModAttributes.GEAR_STATE.create(stack, state);
        ModAttributes.GEAR_TIER.create(stack, tier);
        ModAttributes.GEAR_RARITY.create(stack, rarity);
        ModAttributes.GEAR_MODEL.create(stack, model);
        ModAttributes.ARMOR.create(stack, armor);
        ModAttributes.ARMOR_TOUGHNESS.create(stack, toughness);
        ModAttributes.DURABILITY.create(stack, durability);
        ModAttributes.GEAR_MAX_LEVEL.create(stack, maxLevel);
        ModAttributes.MAX_REPAIRS.create(stack, maxRepairs);
        ModAttributes.MIN_VAULT_LEVEL.create(stack, minVaultLevel);
        ModAttributes.CURRENT_REPAIRS.create(stack, currentRepairs);
        ModAttributes.REFORGED.create(stack, reforged);

        return stack;
    }
}
