package com.bway.SpringDemo.service;

import java.util.List;

import com.bway.SpringDemo.model.Employ;

public interface IEmployService {
	void saveEmploy( Employ employ);
	void deleteEmploy(int id);
	Employ selectemploy(int id);
	void updateEmploy(Employ employ);
	List<Employ> showAll();

}
