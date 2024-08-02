package net.pin.dev.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

import net.minecraft.util.Identifier;
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
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELPICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELHOE, 1)
                .pattern(" RR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELHOE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELAXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELSHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELSHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEELSWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModItems.STEELINGOT)
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.STEELINGOT), conditionsFromItem(ModItems.STEELINGOT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STEELSWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_DINO, 3)
                .input(Items.CHICKEN)
                .criterion(hasItem(Items.PORKCHOP), conditionsFromItem(Items.PORKCHOP))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.RAW_DINO)));

        offerSmelting(exporter, List.of(ModItems.RAW_DINO), RecipeCategory.FOOD, ModItems.DINO, 3f, 80, "dino");

        /*
        CookingRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.DINO, 1, 2, 30, exporter)
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.DINO)));*/
    }
}
