package com.loadapi.laodapi.services;

import java.util.List;


import com.loadapi.laodapi.entity.loads;

public interface loadservice {
	
	public List<loads> getLoads();
	
	public loads getLoad(long shipid);

	public loads addload(loads l);

	public loads updateload(loads l);

	public void deleteloads(long parseLong);
}
