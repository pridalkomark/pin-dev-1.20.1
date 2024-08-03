package net.pin.dev.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class AirCompressorItem extends Item {
    public AirCompressorItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient()){

            BlockPos positionClicked = user.getBlockPos();
            PlayerEntity player = user;
            //World world = ;
/*
            if (player.getOffHandStack().getItem() != Items.FIREWORK_ROCKET){
                return ActionResult.FAIL;
            }*/

            world.playSound(
                    null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                    player.getBlockPos(), // The position of where the sound will come from
                    SoundEvents.ENTITY_ENDER_DRAGON_FLAP, // The sound that will play
                    SoundCategory.BLOCKS, // This determines which of the volume sliders affect this sound
                    1f, //Volume multiplier, 1 is normal, 0.5 is half volume, etc
                    1f // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
            );



            //assert player != null;
            //player.addVelocity(new Vec3d(0d, 3d,0d));
/*
            Vec3d lookVec = player.getRotationVector();
            double x = lookVec.x;
            double y = lookVec.y;
            double z = lookVec.z;
            player.setVelocity(x * 10, y, z * 10);*/

        }

        //PlayerEntity player = context.getPlayer();

        Vec3d lookVec = user.getRotationVector();
        double x = lookVec.x;
        double y = lookVec.y;
        double z = lookVec.z;
        //player.setVelocity(x * 10 * -1, y, z * 10 - 1);
        user.addVelocity(x * 1.1, 1.5, z * 1.1);



        user.getItemCooldownManager().set(this, 50);

        user.getMainHandStack().damage(1, user,
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        //return ActionResult.SUCCESS;
        return super.use(world, user, hand);
    }
/*
    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        if(!context.getWorld().isClient()){

            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            World world = context.getWorld();
/*
            if (player.getOffHandStack().getItem() != Items.FIREWORK_ROCKET){
                return ActionResult.FAIL;
            }*//*

            world.playSound(
                    null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                    player.getBlockPos(), // The position of where the sound will come from
                    SoundEvents.ENTITY_ENDER_DRAGON_FLAP, // The sound that will play
                    SoundCategory.BLOCKS, // This determines which of the volume sliders affect this sound
                    1f, //Volume multiplier, 1 is normal, 0.5 is half volume, etc
                    1f // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
            );



            //assert player != null;
            //player.addVelocity(new Vec3d(0d, 3d,0d));
/*
            Vec3d lookVec = player.getRotationVector();
            double x = lookVec.x;
            double y = lookVec.y;
            double z = lookVec.z;
            player.setVelocity(x * 10, y, z * 10);*//*

        }

        PlayerEntity player = context.getPlayer();

        Vec3d lookVec = player.getRotationVector();
        double x = lookVec.x;
        double y = lookVec.y;
        double z = lookVec.z;
        //player.setVelocity(x * 10 * -1, y, z * 10 - 1);
        player.addVelocity(x * 2, 1.5, z * 2);



        player.getItemCooldownManager().set(this, 50);

        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));

        return ActionResult.SUCCESS;
    }*/
}
