package net.pin.dev.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.pin.dev.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.STEELHOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEELAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEELPICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEELSHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEELSWORD, Models.HANDHELD);

        itemModelGenerator.register(ModItems.DINO, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DINO, Models.GENERATED);

    }
}