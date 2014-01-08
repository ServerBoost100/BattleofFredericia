package com.servanator.minecraft.fredericia.common;

import net.minecraft.block.Block;
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

import com.servanator.minecraft.fredericia.common.FredericiaCommonProxy;
import com.servanator.minecraft.fredericia.common.blocks.BlockBankBlock;
import com.servanator.minecraft.fredericia.common.handlers.FerdericiaServerPacketHandler;
import com.servanator.minecraft.fredericia.common.handlers.FredericiaClientPacketHandler;








@NetworkMod(clientSideRequired=true,serverSideRequired=true,clientPacketHandlerSpec = @SidedPacketHandler(channels= {"MainMod"}, packetHandler = FredericiaClientPacketHandler.class),serverPacketHandlerSpec = @SidedPacketHandler(channels={"MainMod"},packetHandler=FerdericiaServerPacketHandler.class))
@Mod(modid="FredericiaBattle",name="Battle for Frederiksodde",version="Release")


public class MainMod {

@Instance("MainMod")
public static MainMod instance = new MainMod();

@SidedProxy(clientSide="com.servanator.minecraft.fredericia.client.FredericiaClientProxy", serverSide="com.servanator.minecraft.fredericia.common.FredericiaCommonProxy")
	
public static FredericiaCommonProxy proxy;


//BLOCKS

public static Block BankBlock;


@PreInit
public void PreInit(FMLPreInitializationEvent e) {
	
BankBlock = new BlockBankBlock(3000).setUnlocalizedName("Bankblock");
	
}


@Init
public void InitFredericia(FMLInitializationEvent event) {
	//BLOCKS (METHOD)
	
	proxy.registerBlocks();
	
	//MULTIPLAYER ABILLITY
	
	NetworkRegistry.instance().registerGuiHandler(this, proxy); //Registers Class that deals with GUIs
	
	
}

}
