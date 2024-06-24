                                           
The train management project in Java allows for the creation, management, and display of various types of wagons and trains.
It employs an object-oriented approach with classes for wagons (WagonMarchandise, WagonMinerai, WagonPassagers), trains (Train), and personnel (Personnel). 
Each train is associated with a specific type (Marchandise, Minerai, Passagers, PassagersMarchandise) and can only carry compatible wagons. 
Wagons are added to trains with a compatibility check, and exceptions (TrainWagonIncompatibleException) are thrown in case of incompatibility. 
The project also includes methods to calculate and display the total load of a train, whether in terms of volume, tonnage, or number of passengers. 
