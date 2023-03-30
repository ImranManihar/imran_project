package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Entity.Agent;
import com.example.Repository.AgentRepository;
import com.example.Service.AgentService;

@Repository
public class AgentServiceImpl implements AgentService {
	@Autowired
	AgentRepository agentRepository;

	@Override
	public Agent addAgent(Agent agent) {
		// TODO Auto-generated method stub
		agentRepository.save(agent);
		return agent;
	}

	/*
	 * @Override public List<Agent> findAllAgents() { // TODO Auto-generated method
	 * stub return agentRepository.findAll(); }
	 */

	@Override
	public Agent findAgentById(int id) {
		// TODO Auto-generated method stub
		return agentRepository.findById(id).get();
	}

	@Override
	public void deleteAgent(int id) {
		// TODO Auto-generated method stub
		agentRepository.deleteById(id);

	}

	@Override
	public Agent updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		Agent _agent = agentRepository.findById(agent.getAid()).get();
		_agent.setAname(agent.getAname());
		_agent.setASalary(agent.getASalary());

		agentRepository.save(_agent);

		return _agent;
	}

}
