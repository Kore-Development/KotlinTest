package pw.pqtato.kotlintestmod

import net.fabricmc.api.ModInitializer
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import pw.pqtato.kotlintestmod.items.ChocolateBarItem
import pw.pqtato.kotlintestmod.items.FabricItem

class KotlinTestMod : ModInitializer {
    override fun onInitialize() {
        Registry.register(Registry.ITEM, Identifier(Reference.MOD_ID, "fabric_item"), FABRIC_ITEM)
        Registry.register(Registry.ITEM, Identifier(Reference.MOD_ID, "chocolate_bar"), CHOCOLATE_BAR)
    }

    companion object {
        val FABRIC_ITEM = FabricItem()
        val CHOCOLATE_BAR = ChocolateBarItem()
    }
}
