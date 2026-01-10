package ar.edu.unlp.info.oo1.ejercicio16;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	LocalDate from, to;
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}
	
	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return to;
	}
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	public boolean includesDate(LocalDate other) {
		return (to.isAfter(other) || to.isEqual(other)) && 
				(from.isBefore(other) || from.isEqual(other));
	}
	/**
	Retorna true si el período de tiempo del receptor se superpone con el recibido por parámetro
	**/
	public boolean overlaps (DateLapse anotherDateLapse) {
		return !this.to.isBefore(anotherDateLapse.from) &&
				!this.from.isAfter(anotherDateLapse.to);
	}

}
