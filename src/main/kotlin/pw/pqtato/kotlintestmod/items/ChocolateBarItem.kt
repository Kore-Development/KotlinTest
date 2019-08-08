package pw.pqtato.kotlintestmod.items

import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

class ChocolateBarItem : Item(Item.Settings().group(ItemGroup.FOOD).food(food)) {
    companion object {
        val food: FoodComponent = FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build()
    }
}
