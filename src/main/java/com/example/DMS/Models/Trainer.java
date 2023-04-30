package com.example.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * @author S555847
 *
 */

@Entity
public class Trainer {
	
	@Id
	private int trainerId;
	private String trainerName;
	private String TrainerAddress;
	
	public int getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return TrainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		TrainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", TrainerAddress=" + TrainerAddress
				+ "]";
	}
	
	

}
