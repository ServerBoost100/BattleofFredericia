package com.servanator.minecraft.fredericia.common;

import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;

import com.servanator.minecraft.fredericia.common.ui.creativetabs.tabFredericia;




import com.servanator.minecraft.fredericia.common.FredericiaCommonProxy;
import com.servanator.minecraft.fredericia.common.blocks.BlockBankBlock;
import com.servanator.minecraft.fredericia.common.blocks.BlockSilverOre;
import com.servanator.minecraft.fredericia.common.handlers.FredericiaServerPacketHandler;
import com.servanator.minecraft.fredericia.common.handlers.FredericiaClientPacketHandler;
import com.servanator.minecraft.fredericia.common.items.ItemCannonBall;







//mcmod info stuff.
@NetworkMod(clientSideRequired=true,serverSideRequired=true,clientPacketHandlerSpec = @SidedPacketHandler(channels= {"MainMod"}, packetHandler = FredericiaClientPacketHandler.class),serverPacketHandlerSpec = @SidedPacketHandler(channels={"MainMod"},packetHandler=FredericiaServerPacketHandler.class))
@Mod(modid="FredericiaBattle",name="Battle for Frederiksodde",version="Release")


public class MainMod {

	
	//ModCore
@Instance("MainMod")
public static MainMod instance = new MainMod();

public static CreativeTabs tabFredericia = new tabFredericia(CreativeTabs.getNextID(), "Battle for Frederiksodde");

@SidedProxy(clientSide="com.servanator.minecraft.fredericia.client.FredericiaClientProxy", serverSide="com.servanator.minecraft.fredericia.common.FredericiaCommonProxy")
	
public static FredericiaCommonProxy proxy;


//BLOCKS

public static Block BankBlock;
public static Block SilverOre;


//Items

public static Item CannonBall;

@PreInit
public void PreInit(FMLPreInitializationEvent e) {

//ITEMS	
//CannonBall = new ItemCannonBall(5000).setUnlocalizedName("CannonBall");
CannonBall = new ItemCannonBall(5001).setUnlocalizedName("CannonBall").setCreativeTab(tabFredericia).setMaxStackSize(8);
	
	
//BLOCKS	
	
BankBlock = new BlockBankBlock(3000).setUnlocalizedName("Bankblock").setCreativeTab(tabFredericia).setStepSound(BlockBankBlock.soundGrassFootstep);
SilverOre = new BlockSilverOre(3500).setUnlocalizedName("SilverBlock").setCreativeTab(tabFredericia);
	
}


@Init
public void InitFredericia(FMLInitializationEvent event) {
	
	// ORE GENERATION
	
	proxy.registerGenerators();
	
	//ITEMS (METHOD)
	
	proxy.registerItems();
	
	//BLOCKS (METHOD)
	
	proxy.registerBlocks();
	
	//MULTIPLAYER ABILLITY
	
	
	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers Class that deals with GUIs
	
	
}

}
