package hvn.foodrevamped;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import hvn.foodrevamped.client.mixin.HungerBarMixin;

public class FoodRevampedClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Register HUD render callback for custom hunger bar
		HudRenderCallback.EVENT.register((guiGraphics, tickDelta) -> {
			HungerBarMixin.renderHungerBar(guiGraphics, tickDelta);
		});
		
		FoodRevamped.LOGGER.info("FoodRevamped Client LOADED!");
	}
}
