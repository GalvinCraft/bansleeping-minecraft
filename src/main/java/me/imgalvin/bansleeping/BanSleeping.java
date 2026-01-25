package me.imgalvin.bansleeping;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class BanSleeping implements ModInitializer {
	@Override
	public void onInitialize() {
		EntitySleepEvents.ALLOW_SLEEPING.register((Player player, BlockPos blockPos) -> new ServerPlayer.BedSleepingProblem(Component.literal("Sleeping is banned!")));
	}
}