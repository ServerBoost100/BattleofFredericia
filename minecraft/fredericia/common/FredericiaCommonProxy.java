package com.servanator.minecraft.fredericia.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class FredericiaCommonProxy implements IGuiHandler { //Very Important, cant be gui/proxy handler without this
	
	public void registerRenderInformation() //Client Side Texture registering
	{
		
		
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		//For GUI's
		return null;
		
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		//For GUI's
		return null;
		
	}
	
	public void registerTiles() { //Registering TileEntities
		
	}
	
	public void registerBlocks() { //Registering Blocks
		GameRegistry.registerBlock(MainMod.BankBlock, "Bankblock");
		LanguageRegistry.addName(MainMod.BankBlock, "Bank Block");
		GameRegistry.addRecipe(new ItemStack(MainMod.BankBlock), "MMM", "MAM", "MMM", Character.valueOf('M'), Item.seeds, Character.valueOf('A'), Block.dirt);
		GameRegistry.addSmelting(MainMod.BankBlock.blockID, new ItemStack(Block.dirt), 0.3F);
	}
	
	public void registerItems() { //Registering Blocks
		
	}


}
