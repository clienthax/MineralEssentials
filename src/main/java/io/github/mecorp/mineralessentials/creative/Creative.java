package io.github.mecorp.mineralessentials.creative;

import io.github.mecorp.mineralessentials.creative.blocks.CreativeModBlocks;
import io.github.mecorp.mineralessentials.creative.items.CreativeItems;

public class Creative {
	public static void RegisterCreative(){
		CreativeModBlocks.loadCreativeBlocks();
        CreativeItems.RegisterCreativeItems();
	}
}