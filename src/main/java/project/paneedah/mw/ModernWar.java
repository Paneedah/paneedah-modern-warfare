package project.paneedah.mw;

import project.paneedah.mw.GUI.CreativeTabs.*;
import project.paneedah.mw.Proxy.CommonProxy;
import project.paneedah.mw.Utils.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION
)
public class ModernWar {

    @Mod.Instance
    public static ModernWar instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

    public static final CreativeTabs ArmorTab = new ArmorTab(CreativeTabs.getNextID(),"armortab");
    public static final CreativeTabs Weapons = new WeaponsTab(CreativeTabs.getNextID(),"weaponstab");
    public static final CreativeTabs ExplosivesTab = new ExplosivesTab(CreativeTabs.getNextID(),"explosivestab");
    public static final CreativeTabs OtherTab = new OtherTab(CreativeTabs.getNextID(),"othertab");
    public static final CreativeTabs VehiclesTab = new VehiclesTab(CreativeTabs.getNextID(),"vehiclestab");
    public static final CreativeTabs ResourcesTab = new ResourcesTab(CreativeTabs.getNextID(),"resourcestab");
    public static final CreativeTabs DecorationsTab = new DecorationsTab(CreativeTabs.getNextID(),"decorationstab");

}
