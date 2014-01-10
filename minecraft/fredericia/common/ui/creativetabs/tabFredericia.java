package com.servanator.minecraft.fredericia.common.ui.creativetabs;

import com.servanator.minecraft.fredericia.common.MainMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class tabFredericia extends CreativeTabs {

	public tabFredericia(int id, String name) {
		
		super(id, name);
		
	}
	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack() {
		
		return new ItemStack(MainMod.CannonBall.itemID, 1, 0);
		
	}
	public String getTranslatedTabLabel() {
		return "Battle for Frederiksodde";
	}
	
}
