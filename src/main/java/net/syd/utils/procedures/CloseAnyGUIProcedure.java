package net.syd.utils.procedures;

import net.syd.utils.SydsutilsModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@SydsutilsModElements.ModElement.Tag
public class CloseAnyGUIProcedure extends SydsutilsModElements.ModElement {
	public CloseAnyGUIProcedure(SydsutilsModElements instance) {
		super(instance, 34);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CloseAnyGUI!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
