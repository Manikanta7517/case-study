package com.microservice.reservation.entity;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ReservationDetails")
public class Reservation {
	@Id
	@NotNull(message="Reservation ID cannnot be null")
	@Size(min=10,message="Reservation ID should be minimum 10 digits")
	private long reservationId;
	private long roomId;
	private long guestId;
	@NotNull(message="Date cannot be null")
	
	private Date checkInDate;
	@NotNull(message="Date cannot be null")
	
	private Date checkOutDate;
	private int numOfGuest;
	private double totalPrice;
	
	public long getReservationId() {
		return reservationId;
	}
	public void setReservationId(long reservationId) {
		this.reservationId = reservationId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public int getNumOfGuest() {
		return numOfGuest;
	}
	public void setNumOfGuest(int numOfGuest) {
		this.numOfGuest = numOfGuest;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public Reservation(@NotNull(message="Reservation ID cannnot be null")
	@Size(min=10,message="Reservation ID should be minimum 10 digits")long reservationId, long roomId, long guestId,@NotNull(message="Date cannot be null")
	Date checkInDate,@NotNull(message="Date cannot be null")
	Date checkOutDate,
			int numOfGuest, double totalPrice) {
		super();
		this.reservationId = reservationId;
		this.roomId = roomId;
		this.guestId = guestId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.numOfGuest = numOfGuest;
		this.totalPrice = totalPrice;
	}
	public Reservation() {
		
	}
	
	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", roomId=" + roomId + ", guestId=" + guestId
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", numOfGuest=" + numOfGuest
				+ ", totalPrice=" + totalPrice + "]";
	}
		
}
