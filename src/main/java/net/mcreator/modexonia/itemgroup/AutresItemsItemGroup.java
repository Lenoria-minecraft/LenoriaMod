
package net.mcreator.modexonia.itemgroup;

@ModexoniaModElements.ModElement.Tag
public class AutresItemsItemGroup extends ModexoniaModElements.ModElement {

	public AutresItemsItemGroup(ModexoniaModElements instance) {
		super(instance, 95);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabautres_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CaveBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
