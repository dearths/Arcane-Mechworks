package com.dearths.ArcaneMechs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="ArcaneMechs", name="Arcane Mechworks", version="1.7.10-1.0")
public class ArcaneMechs
{
	@Mod.Instance("ArcaneMechs")
	public static ArcaneMechs instance;
	
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
