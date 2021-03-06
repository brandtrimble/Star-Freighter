/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starFreighter.model;

import java.util.Objects;

/**
 *
 * @author Brandon
 */
public class Map 
{
    //Class instance variables
    private Location location;

    //Default Constructor
    public Map() 
    {
        
    }

    //
    @Override
    public String toString() 
    {
        return "Map{" + "location=" + location + '}';
    }
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.location, other.location)) 
        {
            return false;
        }
        return true;
    }

    //
    public Location getLocation() 
    {
        return location;
    }

    public void setLocation(Location location) 
    {
        this.location = location;
    }
    
}
