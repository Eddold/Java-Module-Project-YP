public class Race {
    String winner;
    int distance;

    public void leader(Car carName) {
       int distanceCar = carName.speed * 24;

       if(distanceCar > distance) {
           winner = carName.name;
           distance = distanceCar;
       }
    }
}
