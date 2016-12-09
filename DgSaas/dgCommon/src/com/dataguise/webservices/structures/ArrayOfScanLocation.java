package com.dataguise.webservices.structures;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfScanLocation {
	protected List<ScanLocation> scanLocation;

	public List<ScanLocation> getScanLocation() {
		if(scanLocation==null)
		{
			scanLocation = new ArrayList<ScanLocation>();
		}
		
		return scanLocation;
	}

	public void setScanLocation(List<ScanLocation> scanLocation) {
		this.scanLocation = scanLocation;
	}
	
}
