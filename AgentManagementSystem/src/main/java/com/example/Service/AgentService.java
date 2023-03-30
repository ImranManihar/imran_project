package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Entity.Agent;

@Service
public interface AgentService {
	
	public Agent addAgent(Agent agent);
	
	//public List<Agent> findAllAgents();
	
	public Agent findAgentById(int id);
	
	public void deleteAgent(int id);
	
	public Agent updateAgent(Agent agent);

	//List<Agent> findAllAgents();
	
	

}
