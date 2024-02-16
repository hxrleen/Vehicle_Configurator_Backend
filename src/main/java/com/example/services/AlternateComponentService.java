package com.example.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.dtos.SubCompPrice;

public interface AlternateComponentService {
	public List<SubCompPrice> getDefaultCompname( int model_id);
	List<String> getCompnameByStd( int model_id);
	
	List<String> getCompnameByInt(int model_id);
	List<String> getCompnameByExt(int model_id);
	public List<SubCompPrice> getConfigurableConfig(@Param("model_id") int model_id , @Param("comp_name") String comp_name);
	
	SubCompPrice getFinalConfig(@Param("alt_id") int alt_id );
	
	
	
}