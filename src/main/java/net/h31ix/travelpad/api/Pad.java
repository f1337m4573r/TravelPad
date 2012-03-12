package net.h31ix.travelpad.api;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;

public class Pad {
    
    private Location location = null;
    private String owner = null;
    private String name = null;
    private boolean protect = false;
    List whitelist = null;   
    
    /**
     * Initialize the pad. This object is used ONLY AFTER A PAD IS NAMED.
     *
     * @param  location  Location of the obsidian center of the pad
     * @param  owner owner of the pad's name
     * @param name Name of the pad
     * @param protect If the pad is whitelisted or not
     */    
    public Pad(Location location, String owner, String name, boolean protect)
    {
        this.location = location;
        this.owner = owner;
        this.name = name;
        this.protect = protect;
    }

    /**
     * Get the location of the pad
     *
     * @return  location  Location of the obsidian center of the pad
     */       
    public Location getLocation()
    {
        return location;
    }
    
    /**
     * Get the owner of the pad
     *
     * @return owner Player who owns the pad's name
     */         
    public String getOwner()
    {
        return owner;
    }
    
    /**
     * Get the name of the pad
     *
     * @return  name  Name of the pad
     */      
    public String getName()
    {
        return name;
    }
    
    /**
     * Find if the pad is whitelisted or not
     *
     * @return  protect  True if whitelisted, false if not.
     */      
    public boolean isWhitelisted()
    {
        return protect;
    }
    
    /**
     * Get the list of whitelisted players
     *
     * @return  whitelist  List of whitelisted players, null if there is no whitelist.
     */         
    public List getWhitelist()
    {
        return whitelist;
    }
    
    /**
     * (Re)Name the pad
     *
     * @param  name  Name of the pad
     */      
    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * Set if the pad is whitelisted
     *
     * @param  protect  True if whitelist is on, false if off.
     */        
    public void setWhitelisted(boolean protect)
    {
        this.protect = protect;
    }
    
    /**
     * Set the list of allowed users who can use this pad
     *
     * @param  whitelist  List of whitelisted players
     */        
    public void setWhitelist(List whitelist)
    {
        this.whitelist = whitelist;
    }
    
    /**
     * Add a player to the whitelist
     *
     * @param  player  Player to be added
     */        
    public void addWhitelist(String player)
    {
        if (whitelist == null)
        {
            whitelist = new ArrayList();
        }
        whitelist.add(player);
    }
    
    /**
     * Remove the portal from existance
     */            
    public void delete()
    {
        //TODO: What do?
    }
    
}
