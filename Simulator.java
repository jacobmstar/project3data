public class Simulator {

	public static void main(String[] args) {

		// ArrayList or PriorityQueue of CheckoutLanes, create the lane objects (desired number of each) and add them
		// to the data structure
		
		PriorityQueue<Event> events = new PriorityQueue<>();

		ArrayList<Customer> customers = new ArrayList<>();

		// read in the data file
		// for each line, create a customer object for that person and add it to the customers list
		// also create an ArrivalEvent object and add it to the pq

		// while events pq is not empty
		// poll the next event (Event should implement Comparable and sort by time)
		// see what kind of event it is
		// (if you used subclasses, say if (thisEvent instanceof ArrivalEvent) to do that

		// if this is an ArrivalEvent, create a FinishedShoppingEvent with the right time and add it to the events pq
		//
		// if it's a FinishedShoppingEvent, pick an appropriate checkout lane, add the customer associated with this event
		// to that lane, and figure out their finished checkout time and create a new event based on that and add it 
		// to the pq
		//
		// if this is a finished checkout event, update the average wait time

		// after the big while loop is done, print out the average wait time
	}

}
