package com.servanator.minecraft.fredericia.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;



public class BlockBankBlock extends Block {
	
	public BlockBankBlock(int par1) {
		
		super(par1, Material.grass); //Different Matierials Can be set
		
	}
	
	public void registerIcons(IconRegister iconRegister) {
		blockIcon = iconRegister.registerIcon("fredericia:Bankblock");
		
		
	}

}
