package com.Management.Application.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Management.Application.Dao.MedicineDao;
import com.Management.Application.entity.Medicine;



@Service
public class MedicineServicesimpl implements MedicineServices {
	
	@Autowired
	MedicineDao mediDao;

	@Override
	public String add(Medicine medi) {
		String status=mediDao.mAdd(medi);
		return status;
	}

	@Override
	public String Search() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Delete() {
		// TODO Auto-generated method stub
		return null;
	}

}

