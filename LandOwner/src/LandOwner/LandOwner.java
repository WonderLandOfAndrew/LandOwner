package LandOwner;

import java.util.ArrayList;

public class LandOwner {

	private ArrayList<Land> ownedLand = new ArrayList<Land>();
    public double computeTotalAria() {
    	double totalAria = 0;
    	
    	for(Land a:ownedLand)
    		totalAria += a.computelandArea();

    	return totalAria;
    }
	public boolean add(Land e) {
		return ownedLand.add(e);
	}
	public Land remove(int index) {
		return ownedLand.remove(index);
	}
}
