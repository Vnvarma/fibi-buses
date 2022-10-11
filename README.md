# fibi-buses
Write a function called do_allocation(number_of_people, number_of_buses)
The function should return a list of number of people who can get into the next bus that comes in based on the following logic:
Each bus’s capacity is the sum of the capacities of the previous two buses.
Once all the people get in, then the buses can continue, but will have 0 people inside it.
This is the case when the number of people are less and there are more buses. So after all the people are already boarded, then the remaining buses will have 0 people boarding.
The output of the function is an array/list with the same length as number_of_buses.
The total of this output array/list should be less than or equal to the number_of_people.
The first bus’ capacity can be set to 1 by default.
