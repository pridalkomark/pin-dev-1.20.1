package net.pin.dev.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.pin.dev.block.ModBlocks;
import net.pin.dev.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELPICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELPICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELHOE, 1)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELHOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELAXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELSHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELSHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELSWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELSWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPERPICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPERPICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPERHOE, 1)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPERHOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPERAXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPERAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPERSHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPERSHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COPPERSWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.COPPERSWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AIRCOMPRESSOR, 1)
                .pattern(" B ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.LEATHER)
                .input('R', ModItems.STEELCAN)
                .input('B', ModBlocks.STEEL_BLOCK)
                .criterion(hasItem(ModItems.STEELCAN), conditionsFromItem(ModItems.STEELCAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.AIRCOMPRESSOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COPPERBOMB, 1)
                .pattern("GCG")
                .pattern("CSC")
                .pattern("GCG")
                .input('G', Items.GUNPOWDER)
                .input('C', Items.COPPER_BLOCK)
                .input('S', Items.TNT)
                .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.COPPERBOMB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DIAMONDBOMB, 1)
                .pattern("GCG")
                .pattern("CSC")
                .pattern("GCG")
                .input('G', Items.GUNPOWDER)
                .input('C', Items.DIAMOND)
                .input('S', ModItems.STEELINGOT)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.DIAMONDBOMB)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_DINO, 3)
                .input(Items.CHICKEN)
                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(Items.PORKCHOP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_DINO)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUEBRICK, 1)
                .input(Items.BLUE_DYE)
                .input(Blocks.BRICKS)
                .criterion(hasItem(Items.BLUE_DYE), conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUEBRICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.YELLOWBRICK, 1)
                .input(Items.YELLOW_DYE)
                .input(Blocks.BRICKS)
            .criterion(hasItem(Items.YELLOW_DYE), conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.YELLOWBRICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PURPLEBRICK, 1)
                .input(Items.PURPLE_DYE)
                .input(Blocks.BRICKS)
                .criterion(hasItem(Items.PURPLE_DYE), conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.PURPLEBRICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GREENBRICK, 1)
                .input(ModItems.URAN)
                .input(Blocks.BRICKS)
                .criterion(hasItem(ModItems.URAN), conditionsFromItem(ModItems.URAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.GREENBRICK)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BUSH, 1)
                .input(Items.BONE_MEAL)
                .input(ItemTags.SAPLINGS)
                .criterion(hasItem(ModItems.URAN), conditionsFromItem(ModItems.URAN))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BUSH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADRENALINESHOT, 2)
                .input(Items.RED_MUSHROOM)
                .input(Items.BROWN_MUSHROOM)
                .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ADRENALINESHOT)));

    ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POIDONDAGGER, 1)
                .input(ModItems.STEELSWORD)
                .input(Items.SPIDER_EYE)
                .criterion(hasItem(ModItems.STEELSWORD), conditionsFromItem(ModItems.STEELSWORD))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.POIDONDAGGER)));

        offerSmelting(exporter, List.of(ModItems.RAW_DINO), RecipeCategory.FOOD, ModItems.DINO, 3f, 80, "dino");

        /*
        CookingRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DINO, 1, 2, 30, exporter)
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DINO)));*/
    }
}
