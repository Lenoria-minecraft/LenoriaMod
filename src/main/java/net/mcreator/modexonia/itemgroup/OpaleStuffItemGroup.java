
package net.mcreator.modexonia.itemgroup;

@ModexoniaModElements.ModElement.Tag
public class OpaleStuffItemGroup extends ModexoniaModElements.ModElement {

	public OpaleStuffItemGroup(ModexoniaModElements instance) {
		super(instance, 94);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabopale_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OpaleGemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;

}
