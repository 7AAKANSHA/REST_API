package com.loadapi.laodapi.controller;

import java.util.List;

//import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.loadapi.laodapi.entity.load;
import com.loadapi.laodapi.entity.loads;
import com.loadapi.laodapi.services.loadservice;

@RestController
public class control {
	

	@Autowired
	private loadservice Loadservice;
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return("Hiii from sping  postman ");
	}

	// get the load
	@GetMapping("/loads")
	public List<loads> getLoads()
	{
		return this.Loadservice.getLoads();
		
	}
	
	@GetMapping("/loads/{shipid}")
	public loads getload(@PathVariable String shipid)
	{
		return this.Loadservice.getLoad(Long.parseLong(shipid));
		//return new Response("Success","200");
	}
	
	@PostMapping(path="/loads", consumes = "application/json")
	//@RequestMapping(path="/loads",method= RequestMethod.POST)
	public loads addload(@RequestBody loads l)
	{
		return this.Loadservice.addload(l);
	}
	
	@PutMapping("/loads")
	public loads updateload(@RequestBody loads l)
	{
		return this.Loadservice.updateload(l);
	}
	
	@DeleteMapping("/loads/{shipid}")
	public ResponseEntity<HttpStatus> deleteloads(@PathVariable String shipid)
	{	try
	{	this.Loadservice.deleteloads(Long.parseLong(shipid));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e)
	{
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
