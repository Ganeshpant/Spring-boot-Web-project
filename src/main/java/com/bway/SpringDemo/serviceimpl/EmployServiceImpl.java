package com.bway.SpringDemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bway.SpringDemo.model.Employ;
import com.bway.SpringDemo.repository.EmployRepository;
import com.bway.SpringDemo.service.IEmployService;
@Service
public class EmployServiceImpl implements IEmployService {
@Autowired
private EmployRepository emprepo;
	
	@Override
	public void saveEmploy(Employ employ) {
		
		emprepo.save(employ);
	}

	@Override
	public void deleteEmploy(int id) {
		emprepo.deleteById(id);
		
	}

	@Override
	public void updateEmploy(Employ employ) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employ> showAll() {
		return emprepo.findAll();
	}

	@Override
	public Employ selectemploy(int id) {
		return emprepo.getById(id);
		
	}

}
