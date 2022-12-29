package ru.lukomorebo.lukomorye_site.domain;

public enum BookingStatus {
	Accepted(3),
	Waiting(2),
	RejectedByUser(5),
	WaitingForRejection(1),
	PaymentVerification(0),
	RejectedNonPayment(6),
	RejectedNonGuest(7),
	Done(4),
	Technical(8),
	Hidden(8);

	public final int priority;

	BookingStatus(int priority) {
		this.priority = priority;
	}


}
