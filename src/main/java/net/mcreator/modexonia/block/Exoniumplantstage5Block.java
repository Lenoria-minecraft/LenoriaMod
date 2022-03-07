
package net.mcreator.modexonia.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.SoundEvent;

@ModexoniaModElements.ModElement.Tag
public class Exoniumplantstage5Block extends ModexoniaModElements.ModElement {

	@ObjectHolder("modexonia:exoniumplantstage_5")
	public static final Block block = null;

	public Exoniumplantstage5Block(ModexoniaModElements instance) {
		super(instance, 102);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void clientLoad(FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(block, RenderType.getCutoutMipped());
	}

	public static class CustomBlock extends Block {

		public CustomBlock() {
			super(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT).hardnessAndResistance(1f, 1f).setLightLevel(s -> 0).notSolid()
					.setOpaque((bs, br, bp) -> false));

			setRegistryName("exoniumplantstage_5");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 0;
		}

		@Override
		public ItemStack getPickBlock(BlockState state, RayTraceResult target, IBlockReader world, BlockPos pos, PlayerEntity player) {
			return new ItemStack(ExoniumplantItem.block);
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(ExoniumplantItem.block, (int) (2)));
		}

	}

}
