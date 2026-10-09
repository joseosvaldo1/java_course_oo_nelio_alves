package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	// Attributes:
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	// Date format mask: 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	
	
	// Constructors:
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		
		if (!checkOut.after(checkIn)){
			throw new DomainException("Check-out date must be "
					+ "afer check-in date.");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	// Getters:
	public Date getCheckIn() {
		return checkIn;
	}


	public Date getCheckOut() {
		return checkOut;
	}
	
	// Duration method:
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// updateDates method:
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Reservation dates for "
					+ "update must be future dates.");
		}
		if (!checkOut.after(checkIn)){
			throw new DomainException("Check-out date must be "
					+ "afer check-in date.");
		}


		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	// toString method:
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights.";
	}


	

	
	
	
	
}
