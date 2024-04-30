package B.generics.B.ComparabaleInterface;

public class User implements Comparable<User> {

    private int points;

    public User (int points){
        this.points = points;
    }
    @Override
    public int compareTo(User other) {
        return points - other.points;  // +ve if greater, 0 if equal and -ve if less than the other point
    }
}
