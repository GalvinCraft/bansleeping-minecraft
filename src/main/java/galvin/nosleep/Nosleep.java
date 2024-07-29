package galvin.nosleep;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class Nosleep implements ModInitializer {
	@Override
	public void onInitialize() {
		EntitySleepEvents.ALLOW_SLEEPING.register((PlayerEntity player, BlockPos blockPos) -> {
			player.sendMessage(Text.of("Sleeping is banned!"), true);
			return PlayerEntity.SleepFailureReason.OTHER_PROBLEM;
		});
	}
}