package com.dearths.ArcaneMechs;

import com.dearths.ArcaneMechs.proxy.IProxy;

import main.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class ArcaneMechs
{
	@Mod.Instance(Reference.MOD_ID)
	public static ArcaneMechs instance;
	
	@SidedProxy(clientSide="com.dearths.ArcaneMechs.proxy.ClientProxy", serverSide="com.dearths.ArcaneMechs.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
		//Loads:
		//Network handling
		//Configuration Files
		//Blocks
		//Items
	{
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
		//Loads:
		//GUIs
		//Tile entities
		//Crafting recipes
		//Other event handlers
	{
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
		//Loads:
		//Everything after other mods have loaded
	{
		
	}
}
