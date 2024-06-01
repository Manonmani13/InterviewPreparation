package com.curd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse<T> {

	int recordCount;
	T reponse;
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public T getReponse() {
		return reponse;
	}
	public void setReponse(T reponse) {
		this.reponse = reponse;
	}
	public APIResponse(int recordCount, T reponse) {
		super();
		this.recordCount = recordCount;
		this.reponse = reponse;
	}
	
}
