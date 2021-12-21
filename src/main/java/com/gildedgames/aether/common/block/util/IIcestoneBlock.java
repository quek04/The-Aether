package com.gildedgames.aether.common.block.util;

import com.gildedgames.aether.common.event.events.FreezeEvent;
import com.gildedgames.aether.common.event.hooks.AetherEventHooks;
import com.google.common.collect.Maps;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.tags.FluidTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;

import java.util.Map;
import java.util.function.Supplier;

public interface IIcestoneBlock
{
    Map<Fluid, Block> FREEZABLES = Maps.newHashMap();

    static void registerDefaultFreezables() {
        registerFreezableFluid(() -> Fluids.WATER, () -> Blocks.ICE);
        registerFreezableFluid(() -> Fluids.FLOWING_WATER, () -> Blocks.ICE);
        registerFreezableFluid(() -> Fluids.LAVA, () -> Blocks.OBSIDIAN);
        registerFreezableFluid(() -> Fluids.FLOWING_LAVA, () -> Blocks.OBSIDIAN);
    }

    static void registerFreezableFluid(Supplier<Fluid> fluid, Supplier<Block> block) {
        if (!FREEZABLES.containsKey(fluid.get())) {
            FREEZABLES.put(fluid.get(), block.get());
        }
    }

    static void removeFreezableFluid(Supplier<Fluid> fluid, Supplier<Block> block) {
        if (FREEZABLES.containsKey(fluid.get())) {
            FREEZABLES.remove(fluid.get(), block.get());
        }
    }

    default void freezeFluids(Level worldIn, BlockPos pos) {
        for (int x = -3; x <= 3; x++) {
            for (int y = -3; y <= 3; y++) {
                for (int z = -3; z <= 3; z++) {
                    BlockState sourceBlock = worldIn.getBlockState(pos);
                    BlockPos newPos = pos.offset(x, y, z);
                    BlockState state = worldIn.getBlockState(newPos);
                    Block block = state.getBlock();
                    if (block instanceof LiquidBlock) {
                        FluidState fluidState = state.getFluidState();
                        if (FREEZABLES.containsKey(fluidState.getType())) {
                            BlockState frozenState = FREEZABLES.get(fluidState.getType()).defaultBlockState();
                            FreezeEvent.FreezeFromBlock event = AetherEventHooks.onBlockFreezeFluid(worldIn, newPos, fluidState, frozenState, sourceBlock);
                            if (!event.isCanceled()) {
                                frozenState = event.getFrozenBlock();
                                worldIn.setBlockAndUpdate(newPos, frozenState);
                                if (fluidState.is(FluidTags.LAVA)) {
                                    worldIn.playSound(null, newPos, SoundEvents.LAVA_EXTINGUISH, SoundSource.BLOCKS, 1.0F, 1.0F);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
