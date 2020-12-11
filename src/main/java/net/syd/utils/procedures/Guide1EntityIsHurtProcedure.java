package net.syd.utils.procedures;

import net.syd.utils.SydsutilsModElements;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SydsutilsModElements.ModElement.Tag
public class Guide1EntityIsHurtProcedure extends SydsutilsModElements.ModElement {
	public Guide1EntityIsHurtProcedure(SydsutilsModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure Guide1EntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity && !entity.world.isRemote) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Your guide has left. Press \"J\" to respawn her."), (false));
		}
		if (!entity.world.isRemote)
			entity.remove();
	}
}
