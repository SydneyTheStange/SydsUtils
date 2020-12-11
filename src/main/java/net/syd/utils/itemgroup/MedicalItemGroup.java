
package net.syd.utils.itemgroup;

import net.syd.utils.item.MedkitItem;
import net.syd.utils.SydsutilsModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SydsutilsModElements.ModElement.Tag
public class MedicalItemGroup extends SydsutilsModElements.ModElement {
	public MedicalItemGroup(SydsutilsModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmedical") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MedkitItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
