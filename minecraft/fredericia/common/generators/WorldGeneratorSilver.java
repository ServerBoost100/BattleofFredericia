package com.servanator.minecraft.fredericia.common.generators;

import java.util.Random;

import com.servanator.minecraft.fredericia.common.MainMod;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorSilver implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
			
			switch(world.provider.dimensionId) {
			//case -1: generateNether(world, random, chunkX*16, chunkZ*16);
			case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
			 
			}
			
			
			
		}
		
		public void generateSurface(World world1, Random random1, int BlockX, int BlockZ) {
			
			for(int i =0; i<10;i++)  {
			
				int Xcoord = BlockX + random1.nextInt(16);
				int Zcoord = BlockZ + random1.nextInt(16);
				int Ycoord = random1.nextInt(48);
				
				(new WorldGenMinable(MainMod.SilverOre.blockID, 4)).generate(world1,random1,Xcoord,Ycoord,Zcoord);
				
			}
			
		}
		

	}


/*

package com.servanator.minecraft.fredericia.common.generators;
import java.util.Random;

import com.servanator.minecraft.fredericia.common.MainMod;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorSilver implements IWorldGenerator {
@Override
public void generate(Random random, int chunkX, int chunkZ, World world,
IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
// TODO Auto-generated method stub
switch(world.provider.dimensionId){
//case -1: generateNether(world, random,chunkX*16,chunkZ*16);
case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
}
}



private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
for(int i =0; i<10;i++){
int Xcoord = BlockX + random.nextInt(16);
int Zcoord = BlockZ + random.nextInt(16);
int Ycoord = random.nextInt(16);
(new WorldGenMinable(MainMod.SilverOre.blockID, 4)).generate(world, random, Xcoord, Ycoord, Zcoord);
}}}*/