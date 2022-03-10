package com.loadapi.laodapi.services;

//import java.util.ArrayList;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.loadapi.laodapi.entity.loads;
import com.loadapi.loadapi.dao.dao;

@Service
public class loadimplement implements loadservice {

//	List<loads> list;
	//@Autowired
	private dao Dao;
	
	public loadimplement()
	 {
		//list=new ArrayList<>();
		//list.add(new loads(1024,9," first one",100,1,"canter","chemicals","jaipur"));
		
		
	 }
	
	@Override
	public List<loads> getLoads() {
		// TODO Auto-generated method stub
		
		return Dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public loads getLoad(long shipid) {
		// TODO Auto-generated method stub
		//loads l;
		/*loads l=null;
		for(loads Loads:list)
		{
			if(Loads.getShipid()==shipid)
			{
				l=Loads;
				break;
			}
		}*/
		return Dao.getOne(shipid) ;
	}
	
	public loads updateload(loads l)
	{
		Dao.save(l);
		return l;
	}

	@Override
	public loads addload(loads l) {
		// TODO Auto-generated method stub
		//list.add(l);
		Dao.save(l);
		return l;
	}
	
	@SuppressWarnings("deprecation")
	public void deleteloads(long parselong)
	{
		loads entity =Dao.getOne(parselong);
		Dao.delete(entity);
	}

	
}
