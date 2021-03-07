class CheckoutLane extends Queue<Customer> implements Comparable<CheckoutLane> {

	// instead of extending Queue, you could have a Queue as a private field if you wanted
	// Comparable is to sort by the shortest lane first, if two are tied, prefer an express lane 
}
