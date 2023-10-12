package com.Management.Application.Dao;

import com.Management.Application.entity.Medicine;

public interface MedicineDao {
	public String mAdd(Medicine medi);
	public String mDelete(int mid);
	public Medicine mSearch(int mid);

}
