package com.servanator.minecraft.fredericia.common.blocks;

import java.util.Random;

import com.servanator.minecraft.fredericia.common.MainMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;


public class BlockSilverOre extends Block {
	
	public BlockSilverOre(int par1) {
		
		super(par1, Material.iron); //Different Matierials Can be set
		
	}
	
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fredericia:SilverOre");
		
		
	}
	
	public int idDropped(int par1, Random par2Random, int par3) {
		return MainMod.SilverOre.blockID;
		
		
		
	}
	
	public int quantityDropped(Random random) {
		
		return 1;
	}

}
